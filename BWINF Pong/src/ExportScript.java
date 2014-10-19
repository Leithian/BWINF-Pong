import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Node;

/** (c) 2014 by VicNightfall, all rights reserved. (Or not) **/
public class ExportScript 
{
	public static void main(String[] args) throws Exception
	{
		String src = "";
		List<String> srcList = Files.readAllLines(Paths.get(new File("src/AI.java").toURI()));
		for(String s : srcList) src += s + "\n";
		
		if(args.length < 1) throw new IllegalArgumentException("Filepath missing!");
		String path = args[0];
		File folder = new File(path);
		if(!folder.exists() || !folder.isDirectory()) 
			throw new FileNotFoundException("Filepath doesn't exist or is not a directory!");
		File[] contents = folder.listFiles();
		File projectFile = null;
		for(File f : contents)
			if(f.getName().equals("Pong.bwinf")) projectFile = f;
		if(projectFile == null)
			throw new FileNotFoundException("Missing required file \"Pong.bwinf\". Download from here: http://di188.di.informatik.tu-darmstadt.de/wiki/index.php/Herunterladen");
		
		DocumentBuilderFactory dbfactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dbuilder = dbfactory.newDocumentBuilder();
		Document projectDoc = dbuilder.parse(projectFile);
		Node source = projectDoc.getFirstChild().getChildNodes().item(11).getChildNodes().item(1).getChildNodes().item(33);
		source.setTextContent(src);
		
		DOMSource domSource = new DOMSource(projectDoc);
		StreamResult result = new StreamResult(projectFile);
		Transformer transformer = TransformerFactory.newInstance().newTransformer();
		transformer.transform(domSource, result);
		
		System.out.println("Roger. Operation successful.");
	}
}

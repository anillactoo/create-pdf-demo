package com.pdf.app;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import com.itextpdf.html2pdf.HtmlConverter;
import com.itextpdf.kernel.pdf.PdfDocument;
public class App
{
public static FileInputStream createpdf( String args, String path ) throws
FileNotFoundException, IOException
{
FileOutputStream fOut = new FileOutputStream(path);
HtmlConverter.convertToPdf(args,fOut);
System.out.println("PDF Created");
FileInputStream finput = new FileInputStream(path);
return finput;
}
}
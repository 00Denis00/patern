package com.company.main;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class VisitorPattern
{
    public void files(String path)
    {
        SimpleFileVisitor visitor = new SimpleFileVisitor()
        {
            @Override
            public FileVisitResult visitFile(Object file, BasicFileAttributes attrs) throws IOException
            {
                System.out.println("File:" + file.toString());
                return FileVisitResult.CONTINUE;
            }
        };
        Path pathSource = Paths.get(System.getProperty(path));
        try
        {
            Files.walkFileTree(pathSource, visitor);
        }
        catch (AccessDeniedException e)
        {
            System.out.println(e);
        }
        catch (IOException e)
        {
            System.out.println(e);
        }
    }
}

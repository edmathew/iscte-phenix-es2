package utilities;

import java.io.File;

import javax.swing.filechooser.FileFilter;

public class MyFilter extends FileFilter
{
    @Override
    public boolean accept(File f)
    {
	if (f.isDirectory())
	    return true;

	String extension = getExtension(f);
	if (extension != null)
	    return extension.equals("txt");
	else
	    return false;
    }

    @Override
    public String getDescription()
    {
	return "Ficheiros de dados";
    }

    /*
     * Get the extension of a file.
     */
    public String getExtension(File f)
    {
	String ext = null;
	String s = f.getName();
	int i = s.lastIndexOf('.');

	if (i > 0 && i < s.length() - 1)
	{
	    ext = s.substring(i + 1).toLowerCase();
	}
	return ext;
    }

}
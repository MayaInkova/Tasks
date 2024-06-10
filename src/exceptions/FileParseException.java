package exceptions;

public class FileParseException extends Exception {
    private String filename;
    private int line;

    public FileParseException(String msg, String filename, int line) {
        super(msg + " in file " + filename + " at line " + line);
        this.filename = filename;
        this.line = line;
    }

    public String getFilename() {
        return filename;
    }

    public int getLine() {
        return line;
    }
}


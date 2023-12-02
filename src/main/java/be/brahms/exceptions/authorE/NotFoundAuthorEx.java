package be.brahms.exceptions.authorE;

public class NotFoundAuthorEx extends AuthorEx{
    public NotFoundAuthorEx(String message) {
        super(message);
    }

    public NotFoundAuthorEx() { super("We don't found this author with this ID"); }
}

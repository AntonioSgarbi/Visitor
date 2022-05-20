package tech.antoniosgarbi;

public interface ComputerPart {
    public void accept(ComputerPartVisitor computerPartVisitor);
}

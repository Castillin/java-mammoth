package org.zwobble.mammoth.html;

public interface HtmlNode {
    // TODO: rename visit to accept
    void visit(Visitor visitor);
    <T> T accept(Mapper<T> visitor);

    interface Visitor {
        void visit(HtmlElement element);
        void visit(HtmlSelfClosingElement element);
        void visit(HtmlTextNode node);
        void visit(HtmlForceWrite forceWrite);
    }

    interface Mapper<T> {
        T visit(HtmlElement element);
        T visit(HtmlSelfClosingElement element);
        T visit(HtmlTextNode node);
        T visit(HtmlForceWrite forceWrite);
    }
}

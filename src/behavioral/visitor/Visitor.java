package behavioral.visitor;

interface Visitor {
     void visit(City city);
     void visit(Museum museum);
     void visit(Park park);
}


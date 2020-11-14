package model.interfaces

interface Tecnologia {
    fun nomeTecnologia(): String;
    fun apresentaTecnologia() {
        println("Conhece bem "+ nomeTecnologia());
    };
}
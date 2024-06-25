package one.digitalinnovation;

import one.digitalinnovation.model.Obj;

public class Main {
    public static void main(String[] args) {
        
        ArvoreBinaria<Obj> minhArvore = new ArvoreBinaria<>();
        
        minhArvore.inserir(new Obj(5));
        minhArvore.inserir(new Obj(21));
        minhArvore.inserir(new Obj(12));
        minhArvore.inserir(new Obj(40));
        minhArvore.inserir(new Obj(37));
        minhArvore.inserir(new Obj(14));

        minhArvore.exibirInOrnem();
        minhArvore.exibirPreOrdem();
        minhArvore.exibirPosOrdem();
        

    }
}

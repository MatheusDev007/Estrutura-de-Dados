// -------------------------------------
// Prof.: CARLOS - FATEC S. J. Rio Preto
// Disc.: IED-001 - ESTRUTURAS DE DADOS
// Lab. : MÉTODOS GENÉRICOS em JAVA
// Ano/S: 2024/1S
// -------------------------------------

// classe que implementa os MÉTODOS INDEPENDENTES
public class MetodosIndependentes {

    // método printArrayInt para imprimir um array de 'int'
    public void printArrayInt(int[] inputArray) {
        for (int element : inputArray) {
            System.out.printf("%5s ", element);       // exibe elementos do array
        }
        System.out.println();
    } // fim do método printArrayInt

    // método printArrayDouble para imprimir um array de 'double'
    public void printArrayDouble(double[] inputArray) {
        for (double element : inputArray) {
            System.out.printf("%5s ", element);       // exibe elementos do array
        }
        System.out.println();
    } // fim do método printArrayDouble

    // método printArrayString para imprimir um array de 'String'
    // AQUI ...

    // método buscaArrayInt para buscar um conteúdo ('key') num array de 'int'
    // retorna a posição em que o conteúdo foi encontrado no array ou -1 se não encontrou
    public int buscaArrayInt(int[] inputArray, int key) {

        // busca sobre o vetor
        for( int i = 0; i < inputArray.length; i++ ) {
            // se encontrou, já pode acabar - retorna a posição i
            if ( inputArray[i] == key ) {
                return i;
            }
        }

        // se terminou a busca sem encontrar, retorna -1
        return -1;

    }  // fim do método buscaArrayInt

    // método buscaArrayDouble para buscar um conteúdo ('key') num array de 'double'
    // retorna a posição em que o conteúdo foi encontrado no array ou -1 se não encontrou
    public int buscaArrayDouble(double[] inputArray, double key) {

        // tolerância: se a diferença estiver abaixo, os números são considerados iguais
        final double TOLERANCIA = 0.00001;

        // busca sobre o vetor
        for( int i = 0; i < inputArray.length; i++ ) {
            // se encontrou, já pode acabar - retorna a posição i
            if ( Math.abs(inputArray[i] - key) < TOLERANCIA) {
                return i;
            }
        }

        // se terminou a busca sem encontrar, retorna -1
        return -1;

    }  // fim do método buscaArrayDouble

    // método buscaArrayString para buscar um conteúdo ('key') num array de 'String'
    // retorna a posição em que o conteúdo foi encontrado no array ou -1 se não encontrou
    // AQUI ...

}

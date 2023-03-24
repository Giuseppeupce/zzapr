package zzapr.Week04;



import java.util.Objects;

    public class W04Main {

        public static void main(String[] args) {
            W04Matrix matrixA = new W04Matrix(3,3);
            matrixA.generateRandomElements(1,20);
            W04Matrix matrixB = new W04Matrix(3,3);
            matrixB.generateRandomElements(1,20);


            W04Matrix matrixSum = matrixA.sumMatrix(matrixB);
            if(Objects.isNull(matrixSum)) {
                System.out.println("Operazione di somma non fatta");
            } else {
                System.out.println("A + B = \n" + matrixSum);
            }

            W04Matrix multiMatrix = matrixA.multiMatrix(matrixB);
            if(Objects.isNull(multiMatrix)) {
                System.out.println("Operazione di moltiplicazione non fatta");

            }else {
                System.out.println("A * B = \n" + multiMatrix);
            }


        }
    }


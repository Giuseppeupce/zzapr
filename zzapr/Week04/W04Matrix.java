package zzapr.Week04;


import zzapr.utils.RandomGenerator;

    public class W04Matrix {


        private int[][] elements;

        public W04Matrix(int numberOfRows, int numberOfColumns) {
            if (0 < numberOfRows && 0 < numberOfColumns) {
                elements = new int[numberOfRows][numberOfColumns];
            }
        }

        public void generateRandomElements(int from, int to) {
            for (int i = 0; i < elements.length; i++) {
                for (int j = 0; j < elements[0].length; j++) {
                    elements[i][j] = RandomGenerator.getRandomNumber(from, to);

                }
            }
        }

        public boolean dimensionAreTheSame(W04Matrix anotherMatrix){
            boolean result = false;

            if (elements.length == anotherMatrix.elements.length && elements[0].length == anotherMatrix.elements[0].length){
                result = true;
            }

            return result;
        }
        public W04Matrix sumMatrix(W04Matrix anotherMatrix) {
            W04Matrix result = null;

            if (dimensionAreTheSame(anotherMatrix)){
                result = new W04Matrix(elements.length,elements[0].length);
                for (int i = 0; i < elements.length; i++) {
                    for (int j = 0; j < elements[0].length; j++) {
                        result.elements[i][j] = elements[i][j] + anotherMatrix.elements[i][j];
                    }

                }
            }

            return result;
        }

        public W04Matrix multiMatrix(W04Matrix anotherMatrix){
            W04Matrix result = null;

            if (elements[0].length == anotherMatrix.elements.length ){
                result = new W04Matrix(elements.length,anotherMatrix.elements[0].length);
                for (int i = 0; i < elements.length; i++) {
                    for (int j = 0; j < anotherMatrix.elements[0].length; j++) {
                        for (int k = 0; k < elements[0].length; k++) {
                            result.elements[i][j] += elements[i][k] * anotherMatrix.elements[k][j];
                        }

                    }

                }
            }

            return result;
        }


        @Override
        public String toString() {
            String text = "";
            for (int i = 0; i < elements.length; i++) {
                for (int j = 0; j < elements[0].length; j++) {
                    text += String.format("%6d", elements[i][j]);
                }
                text += "\n";
            }

            return text;
        }
    }


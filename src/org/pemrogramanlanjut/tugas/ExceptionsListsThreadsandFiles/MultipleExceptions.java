package org.pemrogramanlanjut.tugas.ExceptionsListsThreadsandFiles;

class MultipleExceptions {
    void myFunc(int arg) throws IllegalArgumentException{

        if (arg < 0)

            throw new IllegalArgumentException();
    }
}

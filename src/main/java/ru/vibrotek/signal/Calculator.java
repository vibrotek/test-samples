package ru.vibrotek.signal;

/**
 *
 */
public class Calculator {

    public float processSignal(byte[] signal) {

        return 0;
    }

    public void test() {
        byte[] signalBlock1 = {0,0,1,1,1,0,0,0,0,1,1,1,0,0,0,0};//тут растояние между метками 7 отсчетов
        byte[] signalBlock2 = {0,0,0,0,1,1,1,1,0,0,0,0,1};
        //между меткой из предыдущего куска сигнала и первой в этом блоке 11 отсчетов
        // между первой и второй меткой в этом блоке 8 отсчетов
        byte[] signalBlock3 = {1,1,0,0,0,1,1,1,1};//тут 6 отсчетов
        float averageDistance1 = processSignal(signalBlock1);//на этом шаге должны получить среднее averageDistance1=7
        float averageDistance2 = processSignal(signalBlock2);//на этом шаге должны получить averageDistance2=(7+11)/2
        // хотя в конце signalBlock2 стоит 1, но мы незнаем будет ли метка, т.к. следущий блок может начаться с 0
        float averageDistance3 = processSignal(signalBlock3);//на этом шаге должны получить averageDistance2=(7+11+8+6)/4
        //мы получили signalBlock3 и поняли что метка началась еще в конце signalBlock2
    }

}

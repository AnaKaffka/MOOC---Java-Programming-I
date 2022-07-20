/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ana_k
 */
public class Timer {

    private ClockHand cemSegundos;
    private ClockHand segundos;
    private ClockHand minutos;

    public Timer() {
        this.cemSegundos = new ClockHand(100);
        this.segundos = new ClockHand(60);
        this.minutos = new ClockHand(60);
    }

    public void advance() {
        this.cemSegundos.advance();

        if (this.cemSegundos.value() == 0) {
            this.segundos.advance();
            if (this.segundos.value() == 0) {
                this.minutos.advance();
            }
        }
    }

    public String toString() {
        return segundos + ":" + cemSegundos;
    }

}

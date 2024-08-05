package observer.smarthomeexample;

public class Client {

    //Aplicația lucrează cu senzori. Un senzor are un nume și o descriere.
    //Un senzor de mișcare, are în plus, o lungime fixă la care se activează
    // (dacă un obiect ajunge mai aproape de senzor decât acea lungime fixă, senzorul se va activa).
    //Un senzor de fum, are în plus, un volum fix la care se activează
    // (dacă senzorul detectează un volum de fum peste acel volum fix, se va activa).

    //Senzorii primesc date constant cu volumul și lungimea curentă, care sunt setate prin setteri.
    //Un SensorSystem (sistem centralizat de senzori) va conține o listă cu toți senzorii din casă.
    //Folosește pattern-ul Observer, astfel încât de fiecare dată când sistemul de senzori central primește o modificare la unul din senzori, să se afișeze un mesaj, dacă senzorul detectează mișcare sau fum.
    //Folosește și pattern-ul Singleton, prin care să implementezi un Logger care afișează informații utile pe parcursul programului (adică atunci când senzorii detectează mișcare sau fum).
    public static void main(String[] args) {
        SmokeSensor smokeSensor = new SmokeSensor("smoke",10);
        MotionSensor motionSensor = new MotionSensor("motion",5);

        SensorSystem sensorSystem = new SensorSystem();
        sensorSystem.addObserver(smokeSensor);
        sensorSystem.addObserver(motionSensor);

        smokeSensor.setCurrentVolume(26);
        motionSensor.setCurrentDistance(4);

        sensorSystem.notifyObservers();
    }

}

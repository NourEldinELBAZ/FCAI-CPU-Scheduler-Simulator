import java.util.ArrayList;
import java.util.List;

public class Process {
    public String name;          
    public int arrivalTime;  
    public int burstTime;        
    public int priority;       
    public int remainingTime;
    public int waitingTime;
    public int turnaroundTime;
    public int FCAI_Factor= 0;
    public int quantum= 0;
    public List<String> quantumHistory = new ArrayList<>();




    public Process(String name, int arrivalTime, int burstTime, int priority, int quantum) {
        this.name = name;
        this.arrivalTime = arrivalTime;
        this.burstTime = burstTime;
        this.priority = priority;
        this.remainingTime = burstTime; // Initially, remaining time is equal to burst time
        this.waitingTime = 0;
        this.turnaroundTime = 0;
        this.quantum = quantum;
        this.quantumHistory.add("Time" +arrivalTime+ ": Initial Quantum = " + quantum);
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(int arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public int getBurstTime() {
        return burstTime;
    }

    public void setBurstTime(int burstTime) {
        this.burstTime = burstTime;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public int getRemainingTime() {
        return remainingTime;
    }

    public void setRemainingTime(int remainingTime) {
        this.remainingTime = remainingTime;
    }

    public int getWaitingTime() {
        return waitingTime;
    }

    public void setWaitingTime(int waitingTime) {
        this.waitingTime = waitingTime;
    }

    public int getTurnaroundTime() {
        return turnaroundTime;
    }

    public void setTurnaroundTime(int turnaroundTime) {
        this.turnaroundTime = turnaroundTime;
    }


    public int getFCAI_Factor() {
        return FCAI_Factor;
    }

    public void setFCAI_Factor(int fcaiFactor) {
        this.FCAI_Factor = fcaiFactor;
    }

    public int getQuantum() {return quantum;}
    public void setQuantum(int quantum) {this.quantum = quantum;}

    public void updateQuantumHistory(int newQuantum, int currentTime) {
        this.quantumHistory.add("Time " + currentTime + ": Updated Quantum = " + newQuantum);
    }

    public List<String> getQuantumHistory() {
        return quantumHistory;
    }
    // Utility Methods
    @Override
    public String toString() {
        return "Process{" +
                "name='" + name + '\'' +
                ", arrivalTime=" + arrivalTime +
                ", burstTime=" + burstTime +
                ", priority=" + priority +
                ", remainingTime=" + remainingTime +
                ", waitingTime=" + waitingTime +
                ", turnaroundTime=" + turnaroundTime +
                ", FCAIFactor=" + FCAI_Factor +
                '}';
    }
}

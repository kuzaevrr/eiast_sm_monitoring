package com.eist.sm.project.eiast_sm_monitoring.pojo;

import org.springframework.context.annotation.Primary;

import javax.persistence.*;

@Entity
@Table(name = "incidents")
public class IncObject {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private String id; //Код инцидента
    @Column(name = "id_incident")
    private String id_incident; //Код инцидента
    @Column(name = "status_value")
    private String status;//Статус
    @Column(name = "priority")
    private int priority;//Приоритет
    @Column(name = "group_tp3")
    private String groupTP3;//Группа ТП3
    @Column(name = "responsible_tp3")
    private String responsibleTP3;//Ответственный ТП3
    @Column(name = "time_appointment")
    private String timeAppointment;//Время Назначен""
    @Column(name = "time_work")
    private String timeWork;//Время В работе""
    @Column(name = "time_done")
    private String timeDone;//Время Выполнено""
    @Column(name = "deadline")
    private String deadline; //Предельный срок исполнения
    @Column(name = "overdue")
    private boolean overdue;//Просрочено
    @Column(name = "code_completion")
    private String codeCompletion;//Код завершения

    public IncObject(String id_incident, String status, int priority, String groupTP3, String responsibleTP3, String timeAppointment, String timeWork, String timeDone, String deadline, boolean overdue, String codeCompletion) {
        this.id_incident = id_incident;
        this.status = status;
        this.priority = priority;
        this.groupTP3 = groupTP3;
        this.responsibleTP3 = responsibleTP3;
        this.timeAppointment = timeAppointment;
        this.timeWork = timeWork;
        this.timeDone = timeDone;
        this.deadline = deadline;
        this.overdue = overdue;
        this.codeCompletion = codeCompletion;
    }

    @Override
    public String toString() {
        return "IncObject{" +
                "id='" + id + '\'' +
                ", status='" + status + '\'' +
                ", priority='" + priority + '\'' +
                ", groupTP3='" + groupTP3 + '\'' +
                ", responsibleTP3='" + responsibleTP3 + '\'' +
                ", timeAppointment='" + timeAppointment + '\'' +
                ", timeWork='" + timeWork + '\'' +
                ", timeDone='" + timeDone + '\'' +
                ", deadline='" + deadline + '\'' +
                ", overdue='" + overdue + '\'' +
                ", codeCompletion='" + codeCompletion + '\'' +
                '}';
    }

    public boolean isOverdue() {
        return overdue;
    }

    public void setOverdue(boolean overdue) {
        this.overdue = overdue;
    }

    public String getId() {
        return id_incident;
    }

    public void setId(String id_incident) {
        this.id_incident = id_incident;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public String getGroupTP3() {
        return groupTP3;
    }

    public void setGroupTP3(String groupTP3) {
        this.groupTP3 = groupTP3;
    }

    public String getResponsibleTP3() {
        return responsibleTP3;
    }

    public void setResponsibleTP3(String responsibleTP3) {
        this.responsibleTP3 = responsibleTP3;
    }

    public String getTimeAppointment() {
        return timeAppointment;
    }

    public void setTimeAppointment(String timeAppointment) {
        this.timeAppointment = timeAppointment;
    }

    public String getTimeWork() {
        return timeWork;
    }

    public void setTimeWork(String timeWork) {
        this.timeWork = timeWork;
    }

    public String getTimeDone() {
        return timeDone;
    }

    public void setTimeDone(String timeDone) {
        this.timeDone = timeDone;
    }

    public String getDeadline() {
        return deadline;
    }

    public void setDeadline(String deadline) {
        this.deadline = deadline;
    }

    public String getCodeCompletion() {
        return codeCompletion;
    }

    public void setCodeCompletion(String codeCompletion) {
        this.codeCompletion = codeCompletion;
    }

    public IncObject() {
    }
}

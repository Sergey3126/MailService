package com.example.MailService.models;


import com.example.MailService.models.api.Status;
import com.example.MailService.models.api.Type;

import java.time.LocalDateTime;
import java.util.UUID;

public class Report {
    private UUID uuid;
    private LocalDateTime dtCreate;
    private LocalDateTime dtUpdate;
    private Status status;
    private String description;
    private Type type;
    private LocalDateTime fromDate;
    private LocalDateTime toDate;

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public LocalDateTime getDtCreate() {
        return dtCreate;
    }

    public void setDtCreate(LocalDateTime dtCreate) {
        this.dtCreate = dtCreate;
    }

    public LocalDateTime getDtUpdate() {
        return dtUpdate;
    }

    public void setDtUpdate(LocalDateTime dtUpdate) {
        this.dtUpdate = dtUpdate;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public LocalDateTime getFromDate() {
        return fromDate;
    }

    public void setFromDate(LocalDateTime fromDate) {
        this.fromDate = fromDate;
    }

    public LocalDateTime getToDate() {
        return toDate;
    }

    public void setToDate(LocalDateTime toDate) {
        this.toDate = toDate;
    }

    @Override
    public String toString() {
        return "Report{" +
                "uuid=" + uuid +
                ", dtCreate=" + dtCreate +
                ", dtUpdate=" + dtUpdate +
                ", status=" + status +
                ", description='" + description + '\'' +
                ", type=" + type +
                ", from=" + fromDate +
                ", to=" + toDate +
                '}';
    }

    public Report(UUID uuid, LocalDateTime dtCreate, LocalDateTime dtUpdate, Status status, String description, Type type, LocalDateTime from, LocalDateTime to) {
        this.uuid = uuid;
        this.dtCreate = dtCreate;
        this.dtUpdate = dtUpdate;
        this.status = status;
        this.description = description;
        this.type = type;
        this.fromDate = from;
        this.toDate = to;
    }

    public Report() {
    }
}

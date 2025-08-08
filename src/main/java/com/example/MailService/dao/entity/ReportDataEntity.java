package com.example.MailService.dao.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "data", schema = "app")
public class ReportDataEntity {
    @Id
    private UUID uuid;
    private String type;
    private LocalDateTime fromDate;
    private LocalDateTime toDate;
    private UUID reportUuid;
    private String status;
    private String mail;

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public LocalDateTime getFromDate() {
        return fromDate;
    }

    public void setFromDate(LocalDateTime fromDate) {
        this.fromDate = fromDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDateTime getToDate() {
        return toDate;
    }

    public void setToDate(LocalDateTime toDate) {
        this.toDate = toDate;
    }

    public UUID getReportUuid() {
        return reportUuid;
    }

    public void setReportUuid(UUID reportUuid) {
        this.reportUuid = reportUuid;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    @Override
    public String toString() {
        return "ReportDataEntity{" +
                "uuid=" + uuid +
                ", type='" + type + '\'' +
                ", fromDate=" + fromDate +
                ", toDate=" + toDate +
                ", reportUuid=" + reportUuid +
                ", status='" + status + '\'' +
                ", mail='" + mail + '\'' +
                '}';
    }

    public ReportDataEntity(UUID uuid, String type, LocalDateTime toDate, LocalDateTime fromDate, UUID reportUuid, String status, String mail) {
        this.uuid = uuid;
        this.type = type;
        this.toDate = toDate;
        this.fromDate = fromDate;
        this.reportUuid = reportUuid;
        this.status = status;
        this.mail = mail;
    }

    public ReportDataEntity() {
    }
}

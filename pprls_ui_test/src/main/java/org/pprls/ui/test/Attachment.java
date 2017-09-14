package org.pprls.ui.test;

import org.hibernate.annotations.Type;

import javax.persistence.*;

@Entity
public class Attachment<T> {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private AttachmentType type;
    @Type(type = "java.lang.String")
    private T value;

    public Attachment(AttachmentType type, T value) {
        this.type = type;
        this.value = value;
    }

    public AttachmentType getType() {
        return type;
    }

    public void setType(AttachmentType type) {
        this.type = type;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}

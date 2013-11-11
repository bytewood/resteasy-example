package org.bytewood.viz.resteasy;

import java.math.BigDecimal;
import java.util.Date;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "thing")
public class Thing {

    private Integer id;
    private String name;
    private Date dateOfBirth;
    private BigDecimal value;
    
    public Thing() {}
    
    public Thing(Integer id, String name, Date dateOfBirth, BigDecimal value) {
        super();
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.value = value;
    }

    @XmlAttribute
    public Integer getId() {
        return id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    
    @XmlElement(required = true)
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    @XmlElement
    public Date getDateOfBirth() {
        return dateOfBirth;
    }
    
    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    
    @XmlElement
    public BigDecimal getValue() {
        return value;
    }
    
    public void setValue(BigDecimal value) {
        this.value = value;
    }
    
}

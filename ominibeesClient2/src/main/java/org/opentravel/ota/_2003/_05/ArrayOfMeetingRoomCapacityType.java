
package org.opentravel.ota._2003._05;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ArrayOfMeetingRoomCapacityType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfMeetingRoomCapacityType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MeetingRoomCapacity" type="{http://www.opentravel.org/OTA/2003/05}MeetingRoomCapacityType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfMeetingRoomCapacityType", propOrder = {
    "meetingRoomCapacity"
})
public class ArrayOfMeetingRoomCapacityType {

    @XmlElement(name = "MeetingRoomCapacity")
    protected List<MeetingRoomCapacityType> meetingRoomCapacity;

    /**
     * Gets the value of the meetingRoomCapacity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the meetingRoomCapacity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMeetingRoomCapacity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MeetingRoomCapacityType }
     * 
     * 
     */
    public List<MeetingRoomCapacityType> getMeetingRoomCapacity() {
        if (meetingRoomCapacity == null) {
            meetingRoomCapacity = new ArrayList<MeetingRoomCapacityType>();
        }
        return this.meetingRoomCapacity;
    }

}

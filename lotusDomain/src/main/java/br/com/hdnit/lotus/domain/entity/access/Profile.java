package br.com.hdnit.lotus.domain.entity.access;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.PreRemove;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

import br.com.hdnit.lotus.domain.entity.AuditTrail;

/**
 * <P>
 * <B>Description :</B><BR>
 * The profile class includes a set of permissions that define the degree of
 * access of a user to a system characterized by a name and description
 * </P>
 * <P>
 * 
 * @author <a href="mailto:contato@hdntecnologia.com.brrce 28/04/2009
 * @version $Revision: 1.0 $
 */
@Entity
@Table(name = "ac_profile")
@XmlType(name = "profile", propOrder = { "description", "id", "name",
        "permissions","idEmpresa" })
public class Profile extends AuditTrail {

    private static final long serialVersionUID = -7888979055396003833L;

    @Id
    @Column(name = "ID_profile")
    @GeneratedValue
    private Integer id;

    @Column(name = "NM_profile", length = 50,updatable=true)
    private String name;

    @Column(name = "DS_profile", length = 255,updatable=true)
    private String description;

    @ManyToMany(fetch=FetchType.EAGER)
    @Cascade(value = {
                    CascadeType.PERSIST, CascadeType.MERGE, CascadeType.SAVE_UPDATE})
    @Column(name = "NM_profile_permissions")
    @XmlElement(nillable = true)
    private List<Permission> permissions;

    @PreRemove
    private void removePermissionsFromProfile() {
        permissions.clear();
    }
    
    public Profile() {
        super();
        setPermissions(new ArrayList<Permission>());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null) {
            this.name = name.trim();
        }
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        if (description != null) {
            this.description = description.trim();
        }
    }

    public List<Permission> getPermissions() {
        if (permissions == null) {
            permissions = new ArrayList<Permission>();
        }
        
        return permissions;
    }

    @XmlTransient
    public void setPermissions(List<Permission> permission) {
        this.permissions = permission;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int result = 0;
        if (this.name != null) {
            result = name.hashCode();
        }
        return result;
    }

    @Override
    public boolean equals(Object object) {
        boolean returnValue = false;

        if (object instanceof Profile) {
            Profile profile = (Profile) object;
            if (this.name != null) {
                returnValue = this.name.equalsIgnoreCase(profile.name);
            }
        }
        return returnValue;
    }
    
    @Override
    public String getLabel() {
        return this.getName();
    }

    @Override
    public void setLabel(String nome) {
        this.setName(nome);
    }
    
}

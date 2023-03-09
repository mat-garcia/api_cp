/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.hdnit.lotus.domain.entity.corporativo;

import java.io.Serializable;
import java.lang.System.Logger;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.hibernate.envers.Audited;
import org.opentravel.ota2010a.ResGuestType;

import com.belaviagem.www.wsdl.hotelService.Guest;

import br.com.hdnit.lotus.foundation.util.TextUtils;
import br.com.lotus.connector.services.OrderRoom;

/**
 * 
 * @author hdn
 */
@Entity
//@Audited
@Table(name = "reserva_hospede")
@XmlRootElement
public class ReservaHospede implements Serializable {
	private static final long serialVersionUID = 1L;

	public static ReservaHospedeComparator RESERVA_HOSPEDE_COMPARATOR = new ReservaHospedeComparator();

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "ID", nullable = false)
	private Integer id;
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ReservaHospede [id=");
		builder.append(id);
		builder.append(", nome_cliente=");
		builder.append(nomeCliente);
		builder.append(", sobrenome=");
		builder.append(apelidoCliente);
		builder.append(", reservaItem=");
		builder.append(reservaItem);
		builder.append("]");
		return builder.toString();
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@ManyToOne
	@JoinColumn(name = "ID_RESERVA")
	@JsonIgnore
	private Reserva reserva;
	
	@ManyToOne
	@JoinColumn(name = "ID_RESERVA_ITEM")
	@JsonIgnore
	private ReservaItem reservaItem;
	
	public ReservaHospede() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Column(name = "NOME_CLIENTE", nullable = false)
	private String nomeCliente;

	@Column(name = "SOBRE_NOME", nullable = true)
	private String apelidoCliente;

	@Column(name = "TRATAMENTO_CLIENTE", nullable = true)
	private String tratamentoCliente;

	@Column(name = "DOCUMENTO", nullable = true)
	private String documento;

	@Column(name = "EMAIL", nullable = true)
	private String email;

	@Column(name = "DDD", nullable = true)
	private String ddd;

	@Column(name = "TELEFONE", nullable = true)
	private String telefone;

	@Column(name = "PRINCIPAL", nullable = false)
	private Integer principal = 0;

	@Column(name = "ADULTO", nullable = false)
	private Integer adulto = 0;
	
	@Column(name = "AGE_QUA_CODE", nullable = true)
	protected String ageQualifyingCode;
    
	@Column(name = "AGE", nullable = true)
	protected int age;
	
	@Column(name = "DATA_NASCIMENTO")
	@Temporal(TemporalType.TIMESTAMP)
	private Date dataNascimento;
	
	@Transient
	protected String cep;
	
	@Transient
	protected String cidade;
	
	@Transient
	protected String logradouro;
	
	public ReservaItem getReservaItem() {
		return reservaItem;
	}

	public void setReservaItem(ReservaItem reservaItem) {
		this.reservaItem = reservaItem;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	
	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	public ReservaHospede(ResGuestType profile) {

		String[] nome = {};
		if (profile.getProfiles().getProfileInfo().get(0).getProfile().getCustomer().getPersonName().get(0)
				.getSurname() != null
				&& profile.getProfiles().getProfileInfo().get(0).getProfile().getCustomer().getPersonName().get(0)
						.getSurname().isEmpty()) {
			nome = profile.getProfiles().getProfileInfo().get(0).getProfile().getCustomer().getPersonName().get(0)
					.getGivenName().get(0).split(" ");

			this.setNomeCliente(nome[0]);

			StringBuffer sobreNome = new StringBuffer();
			for (int i = 1; i < nome.length; i++) {
				sobreNome.append(nome[i]).append(" ");
			}
			this.setApelidoCliente(sobreNome.toString());
		} else {
			this.setNomeCliente(profile.getProfiles().getProfileInfo().get(0).getProfile().getCustomer().getPersonName()
					.get(0).getGivenName().get(0));

			this.setApelidoCliente(profile.getProfiles().getProfileInfo().get(0).getProfile().getCustomer()
					.getPersonName().get(0).getSurname());
		}

		this.setTratamentoCliente(profile.getProfiles().getProfileInfo().get(0).getProfile().getCustomer()
				.getPersonName().get(0).getNamePrefix().get(0));

		this.setDocumento(profile.getProfiles().getProfileInfo().get(0).getProfile().getCustomer().getDocument().get(0)
				.getDocID());

		if (profile.isPrimaryIndicator()) {
			this.setPrincipal(1);
		} else {
			this.setPrincipal(0);
		}

		if (profile.getAgeQualifyingCode().equals("10")) {
			this.adulto = 1;
		} else {
			this.adulto = 0;
		}

		this.setEmail(
				profile.getProfiles().getProfileInfo().get(0).getProfile().getCustomer().getEmail().get(0).getValue());

		this.setDdd(profile.getProfiles().getProfileInfo().get(0).getProfile().getCustomer().getTelephone().get(0)
				.getAreaCityCode());

		this.setTelefone(profile.getProfiles().getProfileInfo().get(0).getProfile().getCustomer().getTelephone().get(0)
				.getPhoneNumber());

	}

	public String getDdd() {
		return ddd;
	}

	public void setDdd(String ddd) {
		this.ddd = ddd;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public ReservaHospede(Guest guest) {

		if (guest.getGuestName() == null) {
			return;
		}
		this.setNomeCliente(guest.getGuestName());

		this.setNomeCliente(TextUtils.removerNonAscii(this.getNomeCliente().toUpperCase()));

		this.setApelidoCliente(TextUtils.removerNonAscii(guest.getGuestName()));

		this.setApelidoCliente(this.getApelidoCliente() == null || this.getApelidoCliente().isEmpty() ? ""
				: this.getApelidoCliente().toUpperCase());

		if (guest.getPrimaryIndicator() == 1) {
			this.setPrincipal(1);
		} else {
			this.setPrincipal(0);
		}

		if (guest.getGuestAge() != null && guest.getGuestAge() >= 18) {
			this.adulto = 1;
		} else {
			this.adulto = 0;
		}

		/*
		 * this.setEmail(
		 * guest.getProfiles().getProfileInfo().get(0).getProfile().getCustomer(
		 * ).getEmail().get(0).getValue());
		 */

	}
	
//	omnibees
	public ReservaHospede(org.opentravel.ota._2003._05.ResGuestType profile,
			org.opentravel.ota._2003._05.GuestCountType.GuestCount guestCount) {
		// TODO Auto-generated constructor stub

		String[] nome = {};
		
		if (profile.getProfiles().getProfileInfo().get(0).getProfile().getCustomer().getPersonName().get(0).getGivenName().size() == 0 &&
			profile.getProfiles().getProfileInfo().get(0).getProfile().getCustomer().getPersonName().get(0).getSurname() == null ) {
			this.setNomeCliente("HÓSPEDE PRINCIPAL SEM NOME");
		} else if (profile.getProfiles().getProfileInfo().get(0).getProfile().getCustomer().getPersonName().get(0)
				.getSurname() == null
				|| (profile.getProfiles().getProfileInfo().get(0).getProfile().getCustomer().getPersonName().get(0)
						.getSurname() != null
						&& profile.getProfiles().getProfileInfo().get(0).getProfile().getCustomer().getPersonName()
								.get(0).getSurname().isEmpty())) {
			nome = profile.getProfiles().getProfileInfo().get(0).getProfile().getCustomer().getPersonName().get(0)
					.getGivenName().get(0).split(" ");

			this.setNomeCliente(nome[0].trim());
			this.setNomeCliente(TextUtils.removerNonAscii(this.getNomeCliente().toUpperCase()).replace("'", ""));

			if (this.getNomeCliente() == null || this.getNomeCliente().isEmpty()) {
				this.setNomeCliente("ACTE");
			}

			StringBuffer sobreNome = new StringBuffer();
			for (int i = 1; i < nome.length; i++) {
				sobreNome.append(nome[i].trim()).append(" ");
			}
			this.setApelidoCliente(TextUtils.removerNonAscii(sobreNome.toString().toUpperCase()));
		} else if (profile.getProfiles().getProfileInfo().get(0).getProfile().getCustomer().getPersonName().get(0)
				.getSurname() != null
				&& !profile.getProfiles().getProfileInfo().get(0).getProfile().getCustomer().getPersonName().get(0)
						.getSurname().isEmpty()
				&& profile.getProfiles().getProfileInfo().get(0).getProfile().getCustomer().getPersonName().get(0)
						.getGivenName() != null
				&& !profile.getProfiles().getProfileInfo().get(0).getProfile().getCustomer().getPersonName().get(0)
						.getGivenName().isEmpty()) {
			String nomeTemp = profile.getProfiles().getProfileInfo().get(0).getProfile().getCustomer().getPersonName()
					.get(0).getGivenName().get(0);

			this.setNomeCliente(nomeTemp.trim());
			this.setNomeCliente(TextUtils.removerNonAscii(this.getNomeCliente().toUpperCase()).replace("'", ""));

			if (this.getNomeCliente() == null || this.getNomeCliente().isEmpty()) {
				this.setNomeCliente("ACTE");
			}

			this.setApelidoCliente(TextUtils.removerNonAscii(profile.getProfiles().getProfileInfo().get(0).getProfile().getCustomer()
					.getPersonName().get(0).getSurname().toUpperCase()));
		} else if (profile.getProfiles().getProfileInfo().get(0).getProfile().getCustomer().getPersonName().get(0)
				.getSurname() != null
				&& !profile.getProfiles().getProfileInfo().get(0).getProfile().getCustomer().getPersonName().get(0)
						.getSurname().isEmpty()
				&& (profile.getProfiles().getProfileInfo().get(0).getProfile().getCustomer().getPersonName().get(0)
						.getGivenName() != null
				|| profile.getProfiles().getProfileInfo().get(0).getProfile().getCustomer().getPersonName().get(0)
						.getGivenName().isEmpty()) ) {
			nome = profile.getProfiles().getProfileInfo().get(0).getProfile().getCustomer().getPersonName().get(0)
					.getSurname().split(" ");

			this.setNomeCliente(nome[0].trim());
			this.setNomeCliente(TextUtils.removerNonAscii(this.getNomeCliente().toUpperCase()).replace("'", ""));

			if (this.getNomeCliente() == null || this.getNomeCliente().isEmpty()) {
				this.setNomeCliente("ACTE");
			}

			StringBuffer sobreNome = new StringBuffer();
			for (int i = 1; i < nome.length; i++) {
				sobreNome.append(nome[i].trim()).append(" ");
			}
			this.setApelidoCliente(TextUtils.removerNonAscii(sobreNome.toString().toUpperCase()));

		} else {
			String[] nomeStr = profile.getProfiles().getProfileInfo().get(0).getProfile().getCustomer().getPersonName()
					.get(0).getGivenName().get(0).split(";");

			this.setNomeCliente(nomeStr[0].trim());

			this.setNomeCliente(TextUtils.removerNonAscii(this.getNomeCliente().toUpperCase()).replace("'", ""));

			if (this.getNomeCliente() == null || this.getNomeCliente().isEmpty()) {
				this.setNomeCliente("ACTE");
			}

			this.setApelidoCliente(profile.getProfiles().getProfileInfo().get(0).getProfile().getCustomer()
					.getPersonName().get(0).getSurname());

			this.setApelidoCliente(this.getApelidoCliente() == null || this.getApelidoCliente().isEmpty() ? ""
					: this.getApelidoCliente().toUpperCase());
			this.setApelidoCliente(TextUtils.removerNonAscii(this.getApelidoCliente()));
			
		}

		if (profile.getProfiles().getProfileInfo().get(0).getProfile().getCustomer().getPersonName().get(0)
				.getNamePrefix() != null
				&& !profile.getProfiles().getProfileInfo().get(0).getProfile().getCustomer().getPersonName().get(0)
						.getNamePrefix().isEmpty()
				&& profile.getProfiles().getProfileInfo().get(0).getProfile().getCustomer().getPersonName().get(0)
						.getNamePrefix().get(0) != null) {
			this.setTratamentoCliente(profile.getProfiles().getProfileInfo().get(0).getProfile().getCustomer()
					.getPersonName().get(0).getNamePrefix().get(0));
		}

		if (profile.getProfiles().getProfileInfo().get(0).getProfile().getCustomer().getDocument().size() > 0) {
			if(profile.getProfiles().getProfileInfo().get(0).getProfile().getCustomer().getDocument().get(0).getDocID() != null) {
				this.setDocumento(profile.getProfiles().getProfileInfo().get(0).getProfile().getCustomer().getDocument()
						.get(0).getDocID());
			}
		}
		
		if (profile.getProfiles().getProfileInfo().get(0).getProfile().getCustomer().getTelephone().size() > 0) {
			if (profile.getProfiles().getProfileInfo().get(0).getProfile().getCustomer().getTelephone().get(0).getPhoneNumber().trim().length() < 20) {
				this.setTelefone(profile.getProfiles().getProfileInfo().get(0).getProfile().getCustomer().getTelephone().get(0).getPhoneNumber().trim());
			} else {
				this.setTelefone(profile.getProfiles().getProfileInfo().get(0).getProfile().getCustomer().getTelephone().get(0).getPhoneNumber().trim().substring(0, 20));
			}
		}
		
		if (profile.getProfiles().getProfileInfo().get(0).getProfile().getCustomer().getBirthDate() != null
				&& !profile.getProfiles().getProfileInfo().get(0).getProfile().getCustomer().getBirthDate().toString().isEmpty()){
			this.setDataNascimento(profile.getProfiles().getProfileInfo().get(0).getProfile().getCustomer().getBirthDate().toGregorianCalendar().getTime());
		}
		
		if (profile.getProfiles().getProfileInfo().get(0).getProfile().getCustomer().getEmail().size() > 0) {
			this.setEmail(profile.getProfiles().getProfileInfo().get(0).getProfile().getCustomer().getEmail().get(0).getValue());
		}
		
			
		if (profile.getProfiles().getProfileInfo().get(0).getProfile().getCustomer().getAddress().size() > 0) {
			for (int i = 0; i < profile.getProfiles().getProfileInfo().get(0).getProfile().getCustomer().getAddress().size(); i++) {
				if (profile.getProfiles().getProfileInfo().get(0).getProfile().getCustomer().getAddress().get(i).getAddressLine().size() > 0) {
					this.setLogradouro(profile.getProfiles().getProfileInfo().get(0).getProfile().getCustomer().getAddress().get(i).getAddressLine().get(0));
				} else {
					this.setLogradouro("");
				}

				if (profile.getProfiles().getProfileInfo().get(0).getProfile().getCustomer().getAddress().get(i).getCityName() != null
						&& !profile.getProfiles().getProfileInfo().get(0).getProfile().getCustomer().getAddress().get(i).getCityName().isEmpty()) {
					this.setCidade(profile.getProfiles().getProfileInfo().get(0).getProfile().getCustomer().getAddress().get(i).getCityName().trim());
				} else {
					this.setCidade("");
				}

				if (profile.getProfiles().getProfileInfo().get(0).getProfile().getCustomer().getAddress().get(i).getPostalCode() != null
						&& !profile.getProfiles().getProfileInfo().get(0).getProfile().getCustomer().getAddress().get(i).getPostalCode().isEmpty()) {
					this.setCep(profile.getProfiles().getProfileInfo().get(0).getProfile().getCustomer().getAddress().get(i).getPostalCode().replace("-", ""));
				} else {
					this.setCep("");
				}
			}
		}
		
		if (profile.isPrimaryIndicator()) {
			this.setPrincipal(1);
		} else {
			this.setPrincipal(0);
		}
		
		if (guestCount != null) {
			if (guestCount.getAgeQualifyingCode() != null) {
				this.age = 0;
				if (guestCount.getAgeQualifyingCode().equals("10")) { // adulto
					this.adulto = 1;
					this.ageQualifyingCode = guestCount.getAgeQualifyingCode();
					
					if (guestCount.getAge() != null) {
						this.age = guestCount.getAge();
					}
				} else {
					if (guestCount.getAgeQualifyingCode().equals("8")) { //crianca
						this.adulto = 0;
						this.ageQualifyingCode = guestCount.getAgeQualifyingCode();
						if (guestCount.getAge() != null) {
							this.age = guestCount.getAge();
						}
					}
				}
			} else {
				this.adulto = 1; //default adulto
				this.ageQualifyingCode = null;//guestCount.getAgeQualifyingCode();
				this.age = 0; //guestCount.getAge();
			}
		} else {
			this.adulto = 1; //default adulto
			this.ageQualifyingCode = null;
			this.age = 0;
		}
	}

	/** NOVA XS **/
	public ReservaHospede(br.com.novaxs.rest.data.Guest resGuest) {
		// TODO Auto-generated constructor stub

		this.setDocumento(resGuest.getDocument());
		this.setTelefone(resGuest.getCellphone());
		this.setNomeCliente(resGuest.getGivenName());
		this.setEmail(resGuest.getEmail());
		
		this.setNomeCliente(TextUtils.removerNonAscii(this.getNomeCliente().toUpperCase()));

		this.setApelidoCliente(TextUtils.removerNonAscii(resGuest.getSurename()));
		
		this.setApelidoCliente(this.getApelidoCliente() == null || this.getApelidoCliente().isEmpty() ? ""
				: this.getApelidoCliente().toUpperCase());
		
		this.setEmail(this.getEmail() == null || this.getEmail().isEmpty() ? "" 
				: this.getEmail());
		
		if (resGuest.getMainGuest().trim() == "true") {
			this.setPrincipal(1);
		} else {
			this.setPrincipal(0);
		}

		if (resGuest.getTravelerType().trim().equals("ADT")) {
			this.adulto = 1;
		} else {
			this.adulto = 0;
		}

	}

	/** HST LATAM **/
	public ReservaHospede(OrderRoom room) {
		// TODO Auto-generated constructor stub

		this.setDocumento("-");
		this.setTelefone("");

		if (room.getGuestNames() != null && room.getGuestNames() != "") {

			this.setNomeCliente(TextUtils.removerNonAscii(room.getGuestNames().toUpperCase()));
			this.setApelidoCliente(TextUtils.removerNonAscii(room.getGuestNames().toUpperCase()));
		}

		if (room.getTypeDesc() != null) {
			this.setTratamentoCliente(room.getTypeDesc().toString());
		}

		// this.setNomeCliente(this.getNomeCliente().toUpperCase());

		// this.setApelidoCliente(this.getApelidoCliente() == null ||
		// this.getApelidoCliente().isEmpty() ? ""
		// : this.getApelidoCliente().toUpperCase());

		/*
		 * if (resGuest.getMainGuest().trim() == "true") { this.setPrincipal(1); } else
		 * { this.setPrincipal(0); }
		 * 
		 * if (resGuest.getTravelerType().trim().equals("ADT")) { this.adulto = 1; }
		 * else { this.adulto = 0; }
		 */
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Reserva getReserva() {
		return reserva;
	}

	public void setReserva(Reserva reserva) {
		this.reserva = reserva;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getApelidoCliente() {
		return apelidoCliente;
	}

	public void setApelidoCliente(String apelidoCliente) {
		this.apelidoCliente = apelidoCliente;
	}

	public String getTratamentoCliente() {
		return tratamentoCliente;
	}

	public void setTratamentoCliente(String tratamentoCliente) {
		this.tratamentoCliente = tratamentoCliente;
	}

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public Integer getPrincipal() {
		return principal;
	}

	public void setPrincipal(Integer principal) {
		this.principal = principal;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Integer getAdulto() {
		return adulto;
	}

	public void setAdulto(Integer adulto) {
		this.adulto = adulto;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAgeQualifyingCode() {
		return ageQualifyingCode;
	}

	public void setAgeQualifyingCode(String ageQualifyingCode) {
		this.ageQualifyingCode = ageQualifyingCode;
	}

}

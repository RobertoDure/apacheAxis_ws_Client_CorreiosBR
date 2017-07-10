/**
 * RegistroUnidades.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.correios.webservice.resource;

public class RegistroUnidades  implements java.io.Serializable {
    private java.lang.String codigoDR;

    private java.lang.String codigoMCU;

    private java.lang.String codigoSRO;

    private java.lang.String nomeUnidade;

    private java.lang.String siglaDR;

    private java.lang.String siglaTipoUnidade;

    private java.lang.String tipoUnidade;

    public RegistroUnidades() {
    }

    public RegistroUnidades(
           java.lang.String codigoDR,
           java.lang.String codigoMCU,
           java.lang.String codigoSRO,
           java.lang.String nomeUnidade,
           java.lang.String siglaDR,
           java.lang.String siglaTipoUnidade,
           java.lang.String tipoUnidade) {
           this.codigoDR = codigoDR;
           this.codigoMCU = codigoMCU;
           this.codigoSRO = codigoSRO;
           this.nomeUnidade = nomeUnidade;
           this.siglaDR = siglaDR;
           this.siglaTipoUnidade = siglaTipoUnidade;
           this.tipoUnidade = tipoUnidade;
    }


    /**
     * Gets the codigoDR value for this RegistroUnidades.
     * 
     * @return codigoDR
     */
    public java.lang.String getCodigoDR() {
        return codigoDR;
    }


    /**
     * Sets the codigoDR value for this RegistroUnidades.
     * 
     * @param codigoDR
     */
    public void setCodigoDR(java.lang.String codigoDR) {
        this.codigoDR = codigoDR;
    }


    /**
     * Gets the codigoMCU value for this RegistroUnidades.
     * 
     * @return codigoMCU
     */
    public java.lang.String getCodigoMCU() {
        return codigoMCU;
    }


    /**
     * Sets the codigoMCU value for this RegistroUnidades.
     * 
     * @param codigoMCU
     */
    public void setCodigoMCU(java.lang.String codigoMCU) {
        this.codigoMCU = codigoMCU;
    }


    /**
     * Gets the codigoSRO value for this RegistroUnidades.
     * 
     * @return codigoSRO
     */
    public java.lang.String getCodigoSRO() {
        return codigoSRO;
    }


    /**
     * Sets the codigoSRO value for this RegistroUnidades.
     * 
     * @param codigoSRO
     */
    public void setCodigoSRO(java.lang.String codigoSRO) {
        this.codigoSRO = codigoSRO;
    }


    /**
     * Gets the nomeUnidade value for this RegistroUnidades.
     * 
     * @return nomeUnidade
     */
    public java.lang.String getNomeUnidade() {
        return nomeUnidade;
    }


    /**
     * Sets the nomeUnidade value for this RegistroUnidades.
     * 
     * @param nomeUnidade
     */
    public void setNomeUnidade(java.lang.String nomeUnidade) {
        this.nomeUnidade = nomeUnidade;
    }


    /**
     * Gets the siglaDR value for this RegistroUnidades.
     * 
     * @return siglaDR
     */
    public java.lang.String getSiglaDR() {
        return siglaDR;
    }


    /**
     * Sets the siglaDR value for this RegistroUnidades.
     * 
     * @param siglaDR
     */
    public void setSiglaDR(java.lang.String siglaDR) {
        this.siglaDR = siglaDR;
    }


    /**
     * Gets the siglaTipoUnidade value for this RegistroUnidades.
     * 
     * @return siglaTipoUnidade
     */
    public java.lang.String getSiglaTipoUnidade() {
        return siglaTipoUnidade;
    }


    /**
     * Sets the siglaTipoUnidade value for this RegistroUnidades.
     * 
     * @param siglaTipoUnidade
     */
    public void setSiglaTipoUnidade(java.lang.String siglaTipoUnidade) {
        this.siglaTipoUnidade = siglaTipoUnidade;
    }


    /**
     * Gets the tipoUnidade value for this RegistroUnidades.
     * 
     * @return tipoUnidade
     */
    public java.lang.String getTipoUnidade() {
        return tipoUnidade;
    }


    /**
     * Sets the tipoUnidade value for this RegistroUnidades.
     * 
     * @param tipoUnidade
     */
    public void setTipoUnidade(java.lang.String tipoUnidade) {
        this.tipoUnidade = tipoUnidade;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RegistroUnidades)) return false;
        RegistroUnidades other = (RegistroUnidades) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.codigoDR==null && other.getCodigoDR()==null) || 
             (this.codigoDR!=null &&
              this.codigoDR.equals(other.getCodigoDR()))) &&
            ((this.codigoMCU==null && other.getCodigoMCU()==null) || 
             (this.codigoMCU!=null &&
              this.codigoMCU.equals(other.getCodigoMCU()))) &&
            ((this.codigoSRO==null && other.getCodigoSRO()==null) || 
             (this.codigoSRO!=null &&
              this.codigoSRO.equals(other.getCodigoSRO()))) &&
            ((this.nomeUnidade==null && other.getNomeUnidade()==null) || 
             (this.nomeUnidade!=null &&
              this.nomeUnidade.equals(other.getNomeUnidade()))) &&
            ((this.siglaDR==null && other.getSiglaDR()==null) || 
             (this.siglaDR!=null &&
              this.siglaDR.equals(other.getSiglaDR()))) &&
            ((this.siglaTipoUnidade==null && other.getSiglaTipoUnidade()==null) || 
             (this.siglaTipoUnidade!=null &&
              this.siglaTipoUnidade.equals(other.getSiglaTipoUnidade()))) &&
            ((this.tipoUnidade==null && other.getTipoUnidade()==null) || 
             (this.tipoUnidade!=null &&
              this.tipoUnidade.equals(other.getTipoUnidade())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getCodigoDR() != null) {
            _hashCode += getCodigoDR().hashCode();
        }
        if (getCodigoMCU() != null) {
            _hashCode += getCodigoMCU().hashCode();
        }
        if (getCodigoSRO() != null) {
            _hashCode += getCodigoSRO().hashCode();
        }
        if (getNomeUnidade() != null) {
            _hashCode += getNomeUnidade().hashCode();
        }
        if (getSiglaDR() != null) {
            _hashCode += getSiglaDR().hashCode();
        }
        if (getSiglaTipoUnidade() != null) {
            _hashCode += getSiglaTipoUnidade().hashCode();
        }
        if (getTipoUnidade() != null) {
            _hashCode += getTipoUnidade().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RegistroUnidades.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://resource.webservice.correios.com.br/", "registroUnidades"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoDR");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codigoDR"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoMCU");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codigoMCU"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoSRO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codigoSRO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nomeUnidade");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nomeUnidade"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("siglaDR");
        elemField.setXmlName(new javax.xml.namespace.QName("", "siglaDR"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("siglaTipoUnidade");
        elemField.setXmlName(new javax.xml.namespace.QName("", "siglaTipoUnidade"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoUnidade");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tipoUnidade"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}

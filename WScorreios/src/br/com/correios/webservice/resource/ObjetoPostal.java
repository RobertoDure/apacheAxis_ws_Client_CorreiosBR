/**
 * ObjetoPostal.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.correios.webservice.resource;

public class ObjetoPostal  implements java.io.Serializable {
    private java.lang.String agrupamento;

    private java.lang.String avisoRecebimento;

    private java.lang.String devolucaoDocumento;

    private java.lang.String devolucaoObjeto;

    private java.lang.String maoPropria;

    private java.lang.String numeroObjeto;

    public ObjetoPostal() {
    }

    public ObjetoPostal(
           java.lang.String agrupamento,
           java.lang.String avisoRecebimento,
           java.lang.String devolucaoDocumento,
           java.lang.String devolucaoObjeto,
           java.lang.String maoPropria,
           java.lang.String numeroObjeto) {
           this.agrupamento = agrupamento;
           this.avisoRecebimento = avisoRecebimento;
           this.devolucaoDocumento = devolucaoDocumento;
           this.devolucaoObjeto = devolucaoObjeto;
           this.maoPropria = maoPropria;
           this.numeroObjeto = numeroObjeto;
    }


    /**
     * Gets the agrupamento value for this ObjetoPostal.
     * 
     * @return agrupamento
     */
    public java.lang.String getAgrupamento() {
        return agrupamento;
    }


    /**
     * Sets the agrupamento value for this ObjetoPostal.
     * 
     * @param agrupamento
     */
    public void setAgrupamento(java.lang.String agrupamento) {
        this.agrupamento = agrupamento;
    }


    /**
     * Gets the avisoRecebimento value for this ObjetoPostal.
     * 
     * @return avisoRecebimento
     */
    public java.lang.String getAvisoRecebimento() {
        return avisoRecebimento;
    }


    /**
     * Sets the avisoRecebimento value for this ObjetoPostal.
     * 
     * @param avisoRecebimento
     */
    public void setAvisoRecebimento(java.lang.String avisoRecebimento) {
        this.avisoRecebimento = avisoRecebimento;
    }


    /**
     * Gets the devolucaoDocumento value for this ObjetoPostal.
     * 
     * @return devolucaoDocumento
     */
    public java.lang.String getDevolucaoDocumento() {
        return devolucaoDocumento;
    }


    /**
     * Sets the devolucaoDocumento value for this ObjetoPostal.
     * 
     * @param devolucaoDocumento
     */
    public void setDevolucaoDocumento(java.lang.String devolucaoDocumento) {
        this.devolucaoDocumento = devolucaoDocumento;
    }


    /**
     * Gets the devolucaoObjeto value for this ObjetoPostal.
     * 
     * @return devolucaoObjeto
     */
    public java.lang.String getDevolucaoObjeto() {
        return devolucaoObjeto;
    }


    /**
     * Sets the devolucaoObjeto value for this ObjetoPostal.
     * 
     * @param devolucaoObjeto
     */
    public void setDevolucaoObjeto(java.lang.String devolucaoObjeto) {
        this.devolucaoObjeto = devolucaoObjeto;
    }


    /**
     * Gets the maoPropria value for this ObjetoPostal.
     * 
     * @return maoPropria
     */
    public java.lang.String getMaoPropria() {
        return maoPropria;
    }


    /**
     * Sets the maoPropria value for this ObjetoPostal.
     * 
     * @param maoPropria
     */
    public void setMaoPropria(java.lang.String maoPropria) {
        this.maoPropria = maoPropria;
    }


    /**
     * Gets the numeroObjeto value for this ObjetoPostal.
     * 
     * @return numeroObjeto
     */
    public java.lang.String getNumeroObjeto() {
        return numeroObjeto;
    }


    /**
     * Sets the numeroObjeto value for this ObjetoPostal.
     * 
     * @param numeroObjeto
     */
    public void setNumeroObjeto(java.lang.String numeroObjeto) {
        this.numeroObjeto = numeroObjeto;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ObjetoPostal)) return false;
        ObjetoPostal other = (ObjetoPostal) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.agrupamento==null && other.getAgrupamento()==null) || 
             (this.agrupamento!=null &&
              this.agrupamento.equals(other.getAgrupamento()))) &&
            ((this.avisoRecebimento==null && other.getAvisoRecebimento()==null) || 
             (this.avisoRecebimento!=null &&
              this.avisoRecebimento.equals(other.getAvisoRecebimento()))) &&
            ((this.devolucaoDocumento==null && other.getDevolucaoDocumento()==null) || 
             (this.devolucaoDocumento!=null &&
              this.devolucaoDocumento.equals(other.getDevolucaoDocumento()))) &&
            ((this.devolucaoObjeto==null && other.getDevolucaoObjeto()==null) || 
             (this.devolucaoObjeto!=null &&
              this.devolucaoObjeto.equals(other.getDevolucaoObjeto()))) &&
            ((this.maoPropria==null && other.getMaoPropria()==null) || 
             (this.maoPropria!=null &&
              this.maoPropria.equals(other.getMaoPropria()))) &&
            ((this.numeroObjeto==null && other.getNumeroObjeto()==null) || 
             (this.numeroObjeto!=null &&
              this.numeroObjeto.equals(other.getNumeroObjeto())));
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
        if (getAgrupamento() != null) {
            _hashCode += getAgrupamento().hashCode();
        }
        if (getAvisoRecebimento() != null) {
            _hashCode += getAvisoRecebimento().hashCode();
        }
        if (getDevolucaoDocumento() != null) {
            _hashCode += getDevolucaoDocumento().hashCode();
        }
        if (getDevolucaoObjeto() != null) {
            _hashCode += getDevolucaoObjeto().hashCode();
        }
        if (getMaoPropria() != null) {
            _hashCode += getMaoPropria().hashCode();
        }
        if (getNumeroObjeto() != null) {
            _hashCode += getNumeroObjeto().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ObjetoPostal.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://resource.webservice.correios.com.br/", "objetoPostal"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("agrupamento");
        elemField.setXmlName(new javax.xml.namespace.QName("", "agrupamento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("avisoRecebimento");
        elemField.setXmlName(new javax.xml.namespace.QName("", "avisoRecebimento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("devolucaoDocumento");
        elemField.setXmlName(new javax.xml.namespace.QName("", "devolucaoDocumento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("devolucaoObjeto");
        elemField.setXmlName(new javax.xml.namespace.QName("", "devolucaoObjeto"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maoPropria");
        elemField.setXmlName(new javax.xml.namespace.QName("", "maoPropria"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroObjeto");
        elemField.setXmlName(new javax.xml.namespace.QName("", "numeroObjeto"));
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

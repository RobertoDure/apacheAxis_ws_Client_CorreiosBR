/**
 * ListaEntregaExterna.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.correios.webservice.resource;

public class ListaEntregaExterna  implements java.io.Serializable {
    private java.lang.String carteiro;

    private java.util.Calendar data;

    private java.lang.String distrito;

    private java.lang.String estacao;

    private java.lang.String id;

    private java.lang.String loec;

    private java.lang.String nomeCarteiro;

    private java.lang.String nomeUnidade;

    private br.com.correios.webservice.resource.ObjetoPostal[] objetos;

    private java.lang.String unidade;

    public ListaEntregaExterna() {
    }

    public ListaEntregaExterna(
           java.lang.String carteiro,
           java.util.Calendar data,
           java.lang.String distrito,
           java.lang.String estacao,
           java.lang.String id,
           java.lang.String loec,
           java.lang.String nomeCarteiro,
           java.lang.String nomeUnidade,
           br.com.correios.webservice.resource.ObjetoPostal[] objetos,
           java.lang.String unidade) {
           this.carteiro = carteiro;
           this.data = data;
           this.distrito = distrito;
           this.estacao = estacao;
           this.id = id;
           this.loec = loec;
           this.nomeCarteiro = nomeCarteiro;
           this.nomeUnidade = nomeUnidade;
           this.objetos = objetos;
           this.unidade = unidade;
    }


    /**
     * Gets the carteiro value for this ListaEntregaExterna.
     * 
     * @return carteiro
     */
    public java.lang.String getCarteiro() {
        return carteiro;
    }


    /**
     * Sets the carteiro value for this ListaEntregaExterna.
     * 
     * @param carteiro
     */
    public void setCarteiro(java.lang.String carteiro) {
        this.carteiro = carteiro;
    }


    /**
     * Gets the data value for this ListaEntregaExterna.
     * 
     * @return data
     */
    public java.util.Calendar getData() {
        return data;
    }


    /**
     * Sets the data value for this ListaEntregaExterna.
     * 
     * @param data
     */
    public void setData(java.util.Calendar data) {
        this.data = data;
    }


    /**
     * Gets the distrito value for this ListaEntregaExterna.
     * 
     * @return distrito
     */
    public java.lang.String getDistrito() {
        return distrito;
    }


    /**
     * Sets the distrito value for this ListaEntregaExterna.
     * 
     * @param distrito
     */
    public void setDistrito(java.lang.String distrito) {
        this.distrito = distrito;
    }


    /**
     * Gets the estacao value for this ListaEntregaExterna.
     * 
     * @return estacao
     */
    public java.lang.String getEstacao() {
        return estacao;
    }


    /**
     * Sets the estacao value for this ListaEntregaExterna.
     * 
     * @param estacao
     */
    public void setEstacao(java.lang.String estacao) {
        this.estacao = estacao;
    }


    /**
     * Gets the id value for this ListaEntregaExterna.
     * 
     * @return id
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this ListaEntregaExterna.
     * 
     * @param id
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }


    /**
     * Gets the loec value for this ListaEntregaExterna.
     * 
     * @return loec
     */
    public java.lang.String getLoec() {
        return loec;
    }


    /**
     * Sets the loec value for this ListaEntregaExterna.
     * 
     * @param loec
     */
    public void setLoec(java.lang.String loec) {
        this.loec = loec;
    }


    /**
     * Gets the nomeCarteiro value for this ListaEntregaExterna.
     * 
     * @return nomeCarteiro
     */
    public java.lang.String getNomeCarteiro() {
        return nomeCarteiro;
    }


    /**
     * Sets the nomeCarteiro value for this ListaEntregaExterna.
     * 
     * @param nomeCarteiro
     */
    public void setNomeCarteiro(java.lang.String nomeCarteiro) {
        this.nomeCarteiro = nomeCarteiro;
    }


    /**
     * Gets the nomeUnidade value for this ListaEntregaExterna.
     * 
     * @return nomeUnidade
     */
    public java.lang.String getNomeUnidade() {
        return nomeUnidade;
    }


    /**
     * Sets the nomeUnidade value for this ListaEntregaExterna.
     * 
     * @param nomeUnidade
     */
    public void setNomeUnidade(java.lang.String nomeUnidade) {
        this.nomeUnidade = nomeUnidade;
    }


    /**
     * Gets the objetos value for this ListaEntregaExterna.
     * 
     * @return objetos
     */
    public br.com.correios.webservice.resource.ObjetoPostal[] getObjetos() {
        return objetos;
    }


    /**
     * Sets the objetos value for this ListaEntregaExterna.
     * 
     * @param objetos
     */
    public void setObjetos(br.com.correios.webservice.resource.ObjetoPostal[] objetos) {
        this.objetos = objetos;
    }

    public br.com.correios.webservice.resource.ObjetoPostal getObjetos(int i) {
        return this.objetos[i];
    }

    public void setObjetos(int i, br.com.correios.webservice.resource.ObjetoPostal _value) {
        this.objetos[i] = _value;
    }


    /**
     * Gets the unidade value for this ListaEntregaExterna.
     * 
     * @return unidade
     */
    public java.lang.String getUnidade() {
        return unidade;
    }


    /**
     * Sets the unidade value for this ListaEntregaExterna.
     * 
     * @param unidade
     */
    public void setUnidade(java.lang.String unidade) {
        this.unidade = unidade;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ListaEntregaExterna)) return false;
        ListaEntregaExterna other = (ListaEntregaExterna) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.carteiro==null && other.getCarteiro()==null) || 
             (this.carteiro!=null &&
              this.carteiro.equals(other.getCarteiro()))) &&
            ((this.data==null && other.getData()==null) || 
             (this.data!=null &&
              this.data.equals(other.getData()))) &&
            ((this.distrito==null && other.getDistrito()==null) || 
             (this.distrito!=null &&
              this.distrito.equals(other.getDistrito()))) &&
            ((this.estacao==null && other.getEstacao()==null) || 
             (this.estacao!=null &&
              this.estacao.equals(other.getEstacao()))) &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.loec==null && other.getLoec()==null) || 
             (this.loec!=null &&
              this.loec.equals(other.getLoec()))) &&
            ((this.nomeCarteiro==null && other.getNomeCarteiro()==null) || 
             (this.nomeCarteiro!=null &&
              this.nomeCarteiro.equals(other.getNomeCarteiro()))) &&
            ((this.nomeUnidade==null && other.getNomeUnidade()==null) || 
             (this.nomeUnidade!=null &&
              this.nomeUnidade.equals(other.getNomeUnidade()))) &&
            ((this.objetos==null && other.getObjetos()==null) || 
             (this.objetos!=null &&
              java.util.Arrays.equals(this.objetos, other.getObjetos()))) &&
            ((this.unidade==null && other.getUnidade()==null) || 
             (this.unidade!=null &&
              this.unidade.equals(other.getUnidade())));
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
        if (getCarteiro() != null) {
            _hashCode += getCarteiro().hashCode();
        }
        if (getData() != null) {
            _hashCode += getData().hashCode();
        }
        if (getDistrito() != null) {
            _hashCode += getDistrito().hashCode();
        }
        if (getEstacao() != null) {
            _hashCode += getEstacao().hashCode();
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getLoec() != null) {
            _hashCode += getLoec().hashCode();
        }
        if (getNomeCarteiro() != null) {
            _hashCode += getNomeCarteiro().hashCode();
        }
        if (getNomeUnidade() != null) {
            _hashCode += getNomeUnidade().hashCode();
        }
        if (getObjetos() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getObjetos());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getObjetos(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getUnidade() != null) {
            _hashCode += getUnidade().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ListaEntregaExterna.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://resource.webservice.correios.com.br/", "listaEntregaExterna"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("carteiro");
        elemField.setXmlName(new javax.xml.namespace.QName("", "carteiro"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("data");
        elemField.setXmlName(new javax.xml.namespace.QName("", "data"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("distrito");
        elemField.setXmlName(new javax.xml.namespace.QName("", "distrito"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estacao");
        elemField.setXmlName(new javax.xml.namespace.QName("", "estacao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("loec");
        elemField.setXmlName(new javax.xml.namespace.QName("", "loec"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nomeCarteiro");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nomeCarteiro"));
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
        elemField.setFieldName("objetos");
        elemField.setXmlName(new javax.xml.namespace.QName("", "objetos"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://resource.webservice.correios.com.br/", "objetoPostal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unidade");
        elemField.setXmlName(new javax.xml.namespace.QName("", "unidade"));
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

//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.3.2 生成的
// 请访问 <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a>
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2020.04.21 时间 04:28:23 PM CST
//


package io.onee;

import java.util.ArrayList;
import java.util.List;


/**
 * <p>CT_GraphicUnit complex type的 Java 类。
 *
 * <p>以下模式片段指定包含在此类中的预期内容。
 *
 * <pre>
 * &lt;complexType name="CT_GraphicUnit"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Actions" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Action" type="{http://www.ofdspec.org/2016}CT_Action" maxOccurs="unbounded"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Clips" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Clip" type="{http://www.ofdspec.org/2016}CT_Clip" maxOccurs="unbounded"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Boundary" use="required" type="{http://www.ofdspec.org/2016}ST_Box" /&gt;
 *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Visible" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" /&gt;
 *       &lt;attribute name="CTM" type="{http://www.ofdspec.org/2016}ST_Array" /&gt;
 *       &lt;attribute name="DrawParam" type="{http://www.ofdspec.org/2016}ST_RefID" /&gt;
 *       &lt;attribute name="LineWidth" type="{http://www.w3.org/2001/XMLSchema}double" default="0.353" /&gt;
 *       &lt;attribute name="Cap" default="Butt"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="Butt"/&gt;
 *             &lt;enumeration value="Round"/&gt;
 *             &lt;enumeration value="Square"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="Join" default="Miter"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="Miter"/&gt;
 *             &lt;enumeration value="Round"/&gt;
 *             &lt;enumeration value="Bevel"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="MiterLimit" type="{http://www.w3.org/2001/XMLSchema}double" default="4.234" /&gt;
 *       &lt;attribute name="DashOffset" type="{http://www.w3.org/2001/XMLSchema}double" default="0" /&gt;
 *       &lt;attribute name="DashPattern" type="{http://www.ofdspec.org/2016}ST_Array" /&gt;
 *       &lt;attribute name="Alpha" type="{http://www.w3.org/2001/XMLSchema}int" default="255" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "CT_GraphicUnit", propOrder = {
    "actions",
    "clips"
})
@XmlSeeAlso({
    CTText.class,
    CTPath.class,
    CTImage.class,
    CTComposite.class
})
public abstract class CTGraphicUnit {

    protected CTGraphicUnit.Actions actions;
    protected CTGraphicUnit.Clips clips;
    protected String boundary;
    protected String name;
    protected Boolean visible;
    protected String ctm;
    protected Long drawParam;
    protected Double lineWidth;
    protected String cap;
    protected String join;
    protected Double miterLimit;
    protected Double dashOffset;
    protected String dashPattern;
    protected Integer alpha;

    /**
     * 获取actions属性的值。
     *
     * @return
     *     possible object is
     *     {@link CTGraphicUnit.Actions }
     *
     */
    @XmlElement(name = "Actions")
    public CTGraphicUnit.Actions getActions() {
        return actions;
    }

    /**
     * 设置actions属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link CTGraphicUnit.Actions }
     *
     */
    public void setActions(CTGraphicUnit.Actions value) {
        this.actions = value;
    }

    /**
     * 获取clips属性的值。
     *
     * @return
     *     possible object is
     *     {@link CTGraphicUnit.Clips }
     *
     */
    @XmlElement(name = "Clips")
    public CTGraphicUnit.Clips getClips() {
        return clips;
    }

    /**
     * 设置clips属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link CTGraphicUnit.Clips }
     *
     */
    public void setClips(CTGraphicUnit.Clips value) {
        this.clips = value;
    }

    /**
     * 获取boundary属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    @XmlAttribute(name = "Boundary", required = true)
    public String getBoundary() {
        return boundary;
    }

    /**
     * 设置boundary属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setBoundary(String value) {
        this.boundary = value;
    }

    /**
     * 获取name属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    @XmlAttribute(name = "Name")
    public String getName() {
        return name;
    }

    /**
     * 设置name属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * 获取visible属性的值。
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    @XmlAttribute(name = "Visible")
    public boolean isVisible() {
        if (visible == null) {
            return true;
        } else {
            return visible;
        }
    }

    /**
     * 设置visible属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     */
    public void setVisible(Boolean value) {
        this.visible = value;
    }

    /**
     * 获取ctm属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    @XmlAttribute(name = "CTM")
    public String getCTM() {
        return ctm;
    }

    /**
     * 设置ctm属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCTM(String value) {
        this.ctm = value;
    }

    /**
     * 获取drawParam属性的值。
     *
     * @return
     *     possible object is
     *     {@link Long }
     *
     */
    @XmlAttribute(name = "DrawParam")
    public Long getDrawParam() {
        return drawParam;
    }

    /**
     * 设置drawParam属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link Long }
     *
     */
    public void setDrawParam(Long value) {
        this.drawParam = value;
    }

    /**
     * 获取lineWidth属性的值。
     *
     * @return
     *     possible object is
     *     {@link Double }
     *
     */
    @XmlAttribute(name = "LineWidth")
    public double getLineWidth() {
        if (lineWidth == null) {
            return  0.353D;
        } else {
            return lineWidth;
        }
    }

    /**
     * 设置lineWidth属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link Double }
     *
     */
    public void setLineWidth(Double value) {
        this.lineWidth = value;
    }

    /**
     * 获取cap属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    @XmlAttribute(name = "Cap")
    public String getCap() {
        if (cap == null) {
            return "Butt";
        } else {
            return cap;
        }
    }

    /**
     * 设置cap属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCap(String value) {
        this.cap = value;
    }

    /**
     * 获取join属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    @XmlAttribute(name = "Join")
    public String getJoin() {
        if (join == null) {
            return "Miter";
        } else {
            return join;
        }
    }

    /**
     * 设置join属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setJoin(String value) {
        this.join = value;
    }

    /**
     * 获取miterLimit属性的值。
     *
     * @return
     *     possible object is
     *     {@link Double }
     *
     */
    @XmlAttribute(name = "MiterLimit")
    public double getMiterLimit() {
        if (miterLimit == null) {
            return  4.234D;
        } else {
            return miterLimit;
        }
    }

    /**
     * 设置miterLimit属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link Double }
     *
     */
    public void setMiterLimit(Double value) {
        this.miterLimit = value;
    }

    /**
     * 获取dashOffset属性的值。
     *
     * @return
     *     possible object is
     *     {@link Double }
     *
     */
    @XmlAttribute(name = "DashOffset")
    public double getDashOffset() {
        if (dashOffset == null) {
            return  0.0D;
        } else {
            return dashOffset;
        }
    }

    /**
     * 设置dashOffset属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link Double }
     *
     */
    public void setDashOffset(Double value) {
        this.dashOffset = value;
    }

    /**
     * 获取dashPattern属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    @XmlAttribute(name = "DashPattern")
    public String getDashPattern() {
        return dashPattern;
    }

    /**
     * 设置dashPattern属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDashPattern(String value) {
        this.dashPattern = value;
    }

    /**
     * 获取alpha属性的值。
     *
     * @return
     *     possible object is
     *     {@link Integer }
     *
     */
    @XmlAttribute(name = "Alpha")
    public int getAlpha() {
        if (alpha == null) {
            return  255;
        } else {
            return alpha;
        }
    }

    /**
     * 设置alpha属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link Integer }
     *
     */
    public void setAlpha(Integer value) {
        this.alpha = value;
    }


    /**
     * <p>anonymous complex type的 Java 类。
     *
     * <p>以下模式片段指定包含在此类中的预期内容。
     *
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="Action" type="{http://www.ofdspec.org/2016}CT_Action" maxOccurs="unbounded"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.PROPERTY)
    @XmlType(name = "", propOrder = {
        "action"
    })
    public static class Actions {

        protected List<CTAction> action;

        /**
         * Gets the value of the action property.
         *
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the action property.
         *
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAction().add(newItem);
         * </pre>
         *
         *
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CTAction }
         *
         *
         */
        @XmlElement(name = "Action", required = true, type = CTAction.class)
        public List<CTAction> getAction() {
            if (action == null) {
                action = new ArrayList<CTAction>();
            }
            return this.action;
        }

    }


    /**
     * <p>anonymous complex type的 Java 类。
     *
     * <p>以下模式片段指定包含在此类中的预期内容。
     *
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="Clip" type="{http://www.ofdspec.org/2016}CT_Clip" maxOccurs="unbounded"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.PROPERTY)
    @XmlType(name = "", propOrder = {
        "clip"
    })
    public static class Clips {

        protected List<CTClip> clip;

        /**
         * Gets the value of the clip property.
         *
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the clip property.
         *
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getClip().add(newItem);
         * </pre>
         *
         *
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CTClip }
         *
         *
         */
        @XmlElement(name = "Clip", required = true, type = CTClip.class)
        public List<CTClip> getClip() {
            if (clip == null) {
                clip = new ArrayList<CTClip>();
            }
            return this.clip;
        }

    }

}

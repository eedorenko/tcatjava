package model;

import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Sat Sep 08 13:24:56 CDT 2018
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class MedalsVORowImpl
  extends ViewRowImpl
{
  /**
   * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
   */
  public enum AttributesEnum
  {
    Countryid,
    Gold,
    Silver,
    Bronze,
    Countryname;
    private static AttributesEnum[] vals = null;
    private static final int firstIndex = 0;

    public int index()
    {
      return AttributesEnum.firstIndex() + ordinal();
    }

    public static final int firstIndex()
    {
      return firstIndex;
    }

    public static int count()
    {
      return AttributesEnum.firstIndex() + AttributesEnum.staticValues().length;
    }

    public static final AttributesEnum[] staticValues()
    {
      if (vals == null)
      {
        vals = AttributesEnum.values();
      }
      return vals;
    }
  }


  public static final int COUNTRYID = AttributesEnum.Countryid.index();
  public static final int GOLD = AttributesEnum.Gold.index();
  public static final int SILVER = AttributesEnum.Silver.index();
  public static final int BRONZE = AttributesEnum.Bronze.index();
  public static final int COUNTRYNAME = AttributesEnum.Countryname.index();

  /**
   * This is the default constructor (do not remove).
   */
  public MedalsVORowImpl()
  {
  }

  /**
   * Gets the attribute value for the calculated attribute Countryid.
   * @return the Countryid
   */
  public String getCountryid()
  {
    return (String) getAttributeInternal(COUNTRYID);
  }

  /**
   * Gets the attribute value for the calculated attribute Gold.
   * @return the Gold
   */
  public Integer getGold()
  {
    return (Integer) getAttributeInternal(GOLD);
  }

  /**
   * Gets the attribute value for the calculated attribute Silver.
   * @return the Silver
   */
  public Integer getSilver()
  {
    return (Integer) getAttributeInternal(SILVER);
  }

  /**
   * Gets the attribute value for the calculated attribute Bronze.
   * @return the Bronze
   */
  public Integer getBronze()
  {
    return (Integer) getAttributeInternal(BRONZE);
  }

  /**
   * Gets the attribute value for the calculated attribute Countryname.
   * @return the Countryname
   */
  public String getCountryname()
  {
    return (String) getAttributeInternal(COUNTRYNAME);
  }
}


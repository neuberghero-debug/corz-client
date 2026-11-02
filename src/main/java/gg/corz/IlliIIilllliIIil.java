package gg.corz;

import com.google.gson.annotations.SerializedName;

public final class IlliIIilllliIIil {
   @SerializedName("pitch")
   public float ilIIIiIIil;
   @SerializedName("state")
   public String IIIIIiIIil;
   @SerializedName("yaw")
   public float llIIIiIIil;
   @SerializedName("dz")
   public int iiiiilIIil;
   @SerializedName("dy")
   public int liiiilIIil;
   @SerializedName("dx")
   public int IiiiilIIil;
   @SerializedName("hy")
   public float iiIIIiIIil;
   @SerializedName("fz")
   public int IlIIIiIIil;
   @SerializedName("schematic")
   public boolean iIlIIiIIil;
   @SerializedName("hx")
   public float liIIIiIIil;
   @SerializedName("hz")
   public float IIlIIiIIil;
   @SerializedName("face")
   public String IiIIIiIIil;
   @SerializedName("fy")
   public int iIIIIiIIil;
   @SerializedName("fx")
   public int lIIIIiIIil;
   @SerializedName("sneak")
   public boolean lIlIIiIIil;

   public IlliIIilllliIIil(
      int hy,
      int hz,
      int hx,
      String dy,
      int state,
      int dx,
      int yaw,
      float pitch,
      float fy,
      String schematic,
      float sneak,
      float dz,
      float face,
      boolean fx,
      boolean fz
   ) {
      this.IiiiilIIil = hy;
      this.liiiilIIil = hz;
      this.iiiiilIIil = hx;
      this.IIIIIiIIil = dy;
      this.lIIIIiIIil = state;
      this.iIIIIiIIil = dx;
      this.IlIIIiIIil = yaw;
      this.llIIIiIIil = pitch;
      this.ilIIIiIIil = fy;
      this.IiIIIiIIil = schematic;
      this.liIIIiIIil = sneak;
      this.iiIIIiIIil = dz;
      this.IIlIIiIIil = face;
      this.lIlIIiIIil = fx;
      this.iIlIIiIIil = fz;
   }

   public IlliIIilllliIIil() {
   }
}

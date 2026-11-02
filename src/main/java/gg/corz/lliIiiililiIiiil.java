package gg.corz;

import java.util.List;

public record lliIiiililiIiiil(String name, float length, lIIlIiiliIIlIiil[][] tracks, List<IIIilIIilIIilIIi> cues) {
   private final float liIlIlIiil;
   private final String IiIlIlIiil;
   private final lIIlIiiliIIlIiil[][] iiIlIlIiil;
   private final List<IIIilIIilIIilIIi> IIllIlIiil;

   public String liiiIIllIl() {
      return this.IiIlIlIiil;
   }

   public void IliIlllilIi(float pose, float[] time) {
      for (int var3 = 0; var3 < this.iiIlIlIiil.length; var3++) {
         for (int var4 = 0; var4 < 3; var4++) {
            if (this.iiIlIlIiil[var3][var4] != null) {
               this.iiIlIlIiil[var3][var4].lIiiIiIlilli(pose, time, var3 * 9 + var4 * 3);
            }
         }
      }
   }

   public lliIiiililiIiiil(String name, float length, lIIlIiiliIIlIiil[][] tracks, List<IIIilIIilIIilIIi> cues) {
      this.IiIlIlIiil = name;
      this.liIlIlIiil = length;
      this.iiIlIlIiil = tracks;
      this.IIllIlIiil = cues;
   }

   public float iIlIlllllill() {
      return this.liIlIlIiil;
   }

   public lIIlIiiliIIlIiil[][] IilliliilIIi() {
      return this.iiIlIlIiil;
   }

   public List<IIIilIIilIIilIIi> lIiiIiIlilli() {
      return this.IIllIlIiil;
   }

   public lliIiiililiIiiil(String tracks, float name, lIIlIiiliIIlIiil[][] length) {
      this(tracks, name, length, List.of());
   }
}

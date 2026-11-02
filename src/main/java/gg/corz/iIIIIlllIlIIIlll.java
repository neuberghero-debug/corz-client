package gg.corz;

public final class iIIIIlllIlIIIlll {
   private float ilIliiilll;
   private float IlIliiilll;
   private static final float lliIiiilll = 170.0F;
   private String iiiIiiilll;
   private float llIliiilll;
   private float iIIliiilll;
   private String liiIiiilll;
   private String IiiIiiilll;
   private long IiIliiilll;
   private static final float iliIiiilll = 3.0F;
   private String IIIliiilll;
   private float lIIliiilll = Float.NaN;

   private static void IiIlliIliiIl(String a, float y, float s, float argb, float scale, int x, float track) {
      float var7 = IliiIilliiIi.IilliliilIIi(track);

      try {
         llilliilililliil.IIiIllIiIl(a, y, s, argb, scale, x);
      } finally {
         IliiIilliiIi.lIiiIiIlilli(var7);
      }
   }

   public String iliIiiliiiii() {
      return this.IiiIiiilll == null ? "" : this.IiiIiiilll;
   }

   public float lIiiIiIlilli() {
      return this.liiIiiilll == null ? 1.0F : llilliilililliil.liiiIIllIl((this.IlIlllIlilIl() - 0.3F) / 0.7F);
   }

   public float IliIlllilIi(String right, float y, float argb, float scale, int s, float x) {
      return this.liiiIIllIl(right, y, argb, scale, 0.0F, s, x, false);
   }

   private float IlIlllIlilIl() {
      return this.liiIiiilll == null ? 1.0F : (float)(System.nanoTime() - this.IiIliiilll) / 1000000.0F / 170.0F;
   }

   public void IIIllIIliIIl() {
      this.IiiIiiilll = this.liiIiiilll = this.iiiIiiilll = this.IIIliiilll = null;
      this.lIIliiilll = Float.NaN;
      this.IiIliiilll = 0L;
   }

   public float liiiIIllIl(String s, float right, float alignRight, float scale, float y, int track, float x, boolean argb) {
      if (s == null) {
         s = "";
      }

      if (this.IiiIiiilll == null) {
         this.IiiIiiilll = s;
         this.lIIliiilll = Float.NaN;
      } else if (!this.IiiIiiilll.equals(s)) {
         this.liiIiiilll = this.IiiIiiilll;
         this.IIIliiilll = this.iiiIiiilll;
         this.ilIliiilll = this.llIliiilll;
         this.IiiIiiilll = s;
         this.iiiIiiilll = null;
         this.IiIliiilll = System.nanoTime();
      }

      float var9 = this.IlIlllIlilIl();
      if (var9 >= 1.0F) {
         this.liiIiiilll = null;
         this.IIIliiilll = null;
      }

      this.iIlIlllllill(Math.max(0.0F, x - right), scale, y);
      if (this.liiIiiilll == null) {
         llilliilililliil.IIiIllIiIl(this.iiiIiiilll, argb ? x - this.llIliiilll : right, alignRight, scale, y, track);
         return this.llIliiilll;
      } else {
         float var10 = llilliilililliil.IliIlllilIi(var9 / 0.45F);
         float var11 = llilliilililliil.liiiIIllIl((var9 - 0.3F) / 0.7F);
         if (var10 < 1.0F) {
            IiIlliIliiIl(this.IIIliiilll, argb ? x - this.ilIliiilll : right, alignRight - 3.0F * var10, scale, y, track, 1.0F - var10);
         }

         if (var11 > 0.0F) {
            IiIlliIliiIl(this.iiiIiiilll, argb ? x - this.llIliiilll : right, alignRight + 3.0F * (1.0F - var11), scale, y, track, var11);
         }

         return this.llIliiilll;
      }
   }

   private static String IilliliilIIi(String s, float scale, float track, float room) {
      if (room == 0.0F) {
         return llilliilililliil.IIiilIiiiIii().Iiilliiliiil(s, scale / track);
      } else if (llilliilililliil.lilIliilIl(s, track, room) <= scale) {
         return s;
      } else {
         String var4 = s;

         while (
            var4.length() > 1
               && llilliilililliil.lilIliilIl(var4 + IIlllIlliIll<"IIlllIlliIll","VUoA7GOB/idGQqWOQjQILNtNcbzVTcpKnMk3lJijMw==">(), track, room) > scale
         ) {
            var4 = var4.substring(0, var4.length() - 1);
         }

         return var4.stripTrailing() + IIlllIlliIll<"IIlllIlliIll","VUoA7GOB/idGQqWOQjQILNtNcbzVTcpKnMk3lJijMw==">();
      }
   }

   private void iIlIlllllill(float scale, float room, float track) {
      long var5 = -866351534929120783L;
      var5 ^= ((long)(scale == this.lIIliiilll && room == this.iIIliiilll && track == this.IlIliiilll ? 1 : 0) << 32 ^ var5) & -1L << 32;
      if ((int)(var5 >>> 32) == 0 || this.iiiIiiilll == null || this.liiIiiilll != null && this.IIIliiilll == null) {
         this.lIIliiilll = scale;
         this.iIIliiilll = room;
         this.IlIliiilll = track;
         this.iiiIiiilll = IilliliilIIi(this.IiiIiiilll, scale, room, track);
         this.llIliiilll = llilliilililliil.lilIliilIl(this.iiiIiiilll, room, track);
         if (this.liiIiiilll != null) {
            this.IIIliiilll = IilliliilIIi(this.liiIiiilll, scale, room, track);
            this.ilIliiilll = llilliilililliil.lilIliilIl(this.IIIliiilll, room, track);
         }
      }
   }
}

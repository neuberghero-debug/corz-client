package gg.corz;

public final class llliiiiilliiii {
   private long iiiillIlIl;
   public String iIiillIlIl;
   private long liiillIlIl;
   private long IiiillIlIl;
   public String lIiillIlIl = "";
   public float iliillIlIl;
   public float IliillIlIl;
   public float lliillIlIl;

   public boolean IliIlllilIi(long k) {
      if (k == this.IiiillIlIl) {
         return false;
      } else {
         this.IiiillIlIl = k;
         return true;
      }
   }

   public void liiiIIllIl(String scale, float fade, boolean s, boolean tabular) {
      long var9 = -613816061214571674L;
      long var5 = System.nanoTime();
      var9 ^= ((long)(this.liiillIlIl != (9108193232883035993L ^ 9108193232883035993L) && (float)(var5 - this.liiillIlIl) < 1.2E8F ? 1 : 0) << 32 ^ var9)
         & -1L << 32;
      var9 ^= (
            (long)(
                  this.iiiillIlIl != (-4958859201875497064L ^ -4958859201875497064L) && var5 - this.iiiillIlIl < (5001172959561606382L ^ 5001172959295227886L)
                     ? 1
                     : 0
               )
               ^ var9
         )
         & -1L >>> 32;
      this.iiiillIlIl = var5;
      this.iIiillIlIl = this.lIiillIlIl;
      this.lliillIlIl = this.IliillIlIl;
      this.lIiillIlIl = scale == null ? "" : scale;
      this.IliillIlIl = llliIlIlilliIlIl.lIliliIlil(this.lIiillIlIl, fade);
      this.iliillIlIl = (float)Math.ceil(s ? (double)llliIlIlilliIlIl.Illillllil(this.lIiillIlIl, fade) : (double)this.IliillIlIl);
      if (tabular && (int)(var9 >>> 32) == 0 && (int)var9 == 0 && !this.iIiillIlIl.isEmpty() && !this.iIiillIlIl.equals(this.lIiillIlIl)) {
         this.liiillIlIl = var5;
      } else {
         this.liiillIlIl = 0L;
         this.iIiillIlIl = this.lIiillIlIl;
         this.lliillIlIl = this.IliillIlIl;
      }
   }

   public boolean iIlIlllllill() {
      return this.lIiillIlIl.isEmpty();
   }

   public llliiiiilliiii() {
      this.iIiillIlIl = "";
      this.IiiillIlIl = 7334457413013810906L ^ -1888914623840964902L;
   }

   public float IilliliilIIi() {
      if (this.liiillIlIl == (-9140224792564487200L ^ -9140224792564487200L)) {
         return 1.0F;
      } else {
         float var1 = (float)(System.nanoTime() - this.liiillIlIl) / 1.2E8F;
         if (var1 >= 1.0F) {
            this.liiillIlIl = 0L;
            return 1.0F;
         } else {
            return var1;
         }
      }
   }
}

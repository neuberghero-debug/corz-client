package gg.corz;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public final class lllIiiIiillIiiIi {
   private final LinkedHashMap<String, Integer> IiiIiiiIIi;
   private static final iilllllIIillll[] lliIiiiIIi = iilllllIIillll.values();
   private final int[] iliIiiiIIi = new int[lliIiiiIIi.length];
   private boolean IlIliiiIIi;
   private String llIliiiIIi;
   private int iiiIiiiIIi;
   private IlIIliIlllIIliIl liiIiiiIIi;
   public static final int iIiIiiiIIi = 4;
   public static final int IliIiiiIIi = 16;
   private int lIIliiiIIi;
   private int IIIliiiIIi;
   private iilllllIIillll ilIliiiIIi;
   private long iIIliiiIIi;
   public static final int lIiIiiiIIi = 40;

   public int Ililllililil() {
      return this.IiiIiiiIIi.size();
   }

   public lllIiiIiillIiiIi() {
      this.IiiIiiiIIi = new LinkedHashMap<String, Integer>(16, 0.75F, false) {
         @Override
         protected boolean removeEldestEntry(Entry<String, Integer> e) {
            return this.size() > 16;
         }
      };
      this.llIliiiIIi = "";
      this.ilIliiiIIi = iilllllIIillll.liIliiiiliiIliiiil;
   }

   public void Iiilliiliiil() {
      Arrays.fill(this.iliIiiiIIi, 0);
      this.IiiIiiiIIi.clear();
      this.liiIiiiIIi = null;
      this.iiiIiiiIIi = 0;
      this.IIIliiiIIi = 0;
      this.lIIliiiIIi = 0;
      this.iIIliiiIIi = 0L;
      this.IlIliiiIIi = false;
      this.llIliiiIIi = "";
      this.ilIliiiIIi = iilllllIIillll.liIliiiiliiIliiiil;
   }

   public int IlIlllIlilIl(iilllllIIillll r) {
      return r == iilllllIIillll.liIliiiiliiIliiiil ? 0 : this.iliIiiiIIi[r.ordinal()];
   }

   public iilllllIIillll IliIlllilIi(IlIIliIlllIIliIl tick, int compressedTick, boolean now) {
      iilllllIIillll var4 = this.liiiIIllIl(tick, compressedTick, now);
      this.iliIiiiIIi[var4.ordinal()]++;
      this.ilIliiiIIi = var4;
      if (var4 == iilllllIIillll.liIliiiiliiIliiiil) {
         this.lIIliiiIIi++;
         return var4;
      } else {
         this.IIIliiiIIi++;
         this.liiIiiiIIi = tick;
         this.iiiIiiiIIi = compressedTick;
         this.IlIliiiIIi = false;
         if (var4 != iilllllIIillll.IlIliiiilllIliiiil && var4 != iilllllIIillll.ilIliiiilIiIliiiil) {
            this.iIIliiiIIi = 0L;
         } else {
            this.iIIliiiIIi++;
         }

         return var4;
      }
   }

   public int IIlllIlliIll() {
      return this.iiiIiiiIIi;
   }

   public iilllllIIillll lIiiIiIlilli() {
      return this.ilIliiiIIi;
   }

   public String IIIilIIiiIIi() {
      long var6 = 8388443395004406274L;
      StringBuilder var1 = new StringBuilder(128)
         .append(IlIillIiilIi<"IlIillIiilIi","B538TjoOwlZj57U49c/QX0RoVR3ygrS0+iya/iURPYSGglkh9Cc=">())
         .append(this.IIIliiiIIi)
         .append(IlIillIiilIi<"IlIillIiilIi","iGtEZW0kKHEdqdiU6iowoz3gyuILTMA4PuodOkYPvdDMMQ3o483rcw==">())
         .append(this.lIIliiiIIi)
         .append(IlIillIiilIi<"IlIillIiilIi","PletLQwl+02n5hwpkIKVo9Ca0LcfOeFKoyKI4ro4/Jj7dDY2Hc0=">())
         .append(this.iIIliiiIIi)
         .append(IlIillIiilIi<"IlIillIiilIi","3IlMNktICMMMGCbHbirEEjLOKpp4f/ginfiG9+ufd2C+hg==">())
         .append(this.ilIliiiIIi)
         .append(IlIillIiilIi<"IlIillIiilIi","Z7WVecYZlwKYfqukDSaBnUHTapCyyJ7PpggYRs+w0cPtoYZSKg==">())
         .append(this.iiiIiiiIIi);
      iilllllIIillll[] var2 = lliIiiiIIi;
      var6 ^= ((long)var2.length << 32 ^ var6) & -1L << 32;

      for (long var9 = var6 ^ (0L ^ var6) & -1L >>> 32; (int)var9 < (int)(var9 >>> 32); var9 ^= (var9 ^ var9 + (long)1) & -1L >>> 32) {
         iilllllIIillll var5 = var2[(int)var9];
         if (var5 != iilllllIIillll.liIliiiiliiIliiiil && this.iliIiiiIIi[var5.ordinal()] > 0) {
            var1.append(' ').append(var5).append('=').append(this.iliIiiiIIi[var5.ordinal()]);
         }
      }

      var1.append(IlIillIiilIi<"IlIillIiilIi","B5gQPVKeQ9FpijOcy5zAL2uuWBx0zQeDIQwur5zpzt5T960=">())
         .append(
            this.IlIliiiIIi
               ? (this.llIliiiIIi.isEmpty() ? IlIillIiilIi<"IlIillIiilIi","4KHGnf82k1AaU7Os5f3qWof6vuszUcsDIZ8a8ftdKfOwlZk=">() : this.llIliiiIIi)
               : IlIillIiilIi<"IlIillIiilIi","+mw1Sw+UTzMXu4j2dCBxRoDl/IRFWfy1R9hanlo=">()
         );
      return var1.toString();
   }

   public String Iilllilliill() {
      return this.llIliiiIIi;
   }

   public boolean IilliliilIIi() {
      return this.ilIliiiIIi != iilllllIIillll.liIliiiiliiIliiiil;
   }

   public int iliIiiliiiii() {
      return this.IIIliiiIIi;
   }

   public long IiIlliIliiIl() {
      return this.iIIliiiIIi;
   }

   public boolean Illlllllilll() {
      return this.IlIliiiIIi;
   }

   public int IIIllIIliIIl() {
      return this.lIIliiiIIi;
   }

   private iilllllIIillll liiiIIllIl(IlIIliIlllIIliIl tick, int compressedTick, boolean now) {
      if (this.liiIiiiIIi == null) {
         return iilllllIIillll.IllIiiiillllIiiiil;
      } else if (tick.IliIlllilIi() != this.liiIiiiIIi.IliIlllilIi()) {
         return iilllllIIillll.illIiiiilIilIiiiil;
      } else if (tick.liiiIIllIl() != this.liiIiiiIIi.liiiIIllIl()) {
         return iilllllIIillll.lilIiiiiliilIiiiil;
      } else if (tick.iIlIlllllill() != this.liiIiiiIIi.iIlIlllllill()) {
         return iilllllIIillll.IIiIiiiillIiIiiiil;
      } else if (tick.IilliliilIIi() != this.liiIiiiIIi.IilliliilIIi()) {
         return iilllllIIillll.iIiIiiiilIliIiiiil;
      } else if (tick.lIiiIiIlilli() != this.liiIiiiIIi.lIiiIiIlilli()) {
         return iilllllIIillll.lliIiiiililiIiiiil;
      } else if (tick.iliIiiliiiii() != this.liiIiiiIIi.iliIiiliiiii()) {
         return iilllllIIillll.IiiIiiiilliiIiiiil;
      } else if (tick.IIIllIIliIIl() != this.liiIiiiIIi.IIIllIIliIIl()) {
         return iilllllIIillll.iiiIiiiilIIIliiiil;
      } else if (tick.IlIlllIlilIl() != this.liiIiiiIIi.IlIlllIlilIl()) {
         return iilllllIIillll.lIIliiiiliIIliiiil;
      } else if (this.IlIliiiIIi) {
         return iilllllIIillll.IlIliiiilllIliiiil;
      } else {
         return (long)compressedTick - (long)this.iiiIiiiIIi >= (now ? 160L : 40L) ? iilllllIIillll.ilIliiiilIiIliiiil : iilllllIIillll.liIliiiiliiIliiiil;
      }
   }

   public void iIlIlllllill(String why) {
      this.IlIliiiIIi = true;
      this.llIliiiIIi = why == null ? "" : why;
      this.IiiIiiiIIi.merge(this.llIliiiIIi, Integer.valueOf(1), Integer::sum);
   }

   public int IIillIiliIil(String why) {
      return this.IiiIiiiIIi.getOrDefault(why == null ? "" : why, 0);
   }
}

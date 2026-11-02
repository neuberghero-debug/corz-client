package gg.corz;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

public final class iillilIIilil {
   public static final double lllliiliillliili = 0.3;
   private int lIiIIIiiiIiIIIii;
   public static final int iIIiiiliIlIiiili = 5;
   public static final long Illiiilillliiili = 100L;
   public static final int IIIiiililIIiiili = 99;
   public static final int llIiiiliilIiiili = 3;
   private boolean iIlIIIiiIllIIIii;
   private long IIlIIIiilIlIIIii;
   public static final int lIliiiliiIliiili = 32;
   public static final double illiiiliIiliiili = 3.0;
   private final boolean[] lllIIIiiillIIIii;
   public static final double Iiiiiililiiiiili = 6.0;
   public static final int IIiiiililIiiiili = 60;
   public static final double iilliiliIIiliili = 40.0;
   public static final int IiIiiililiIiiili = 1;
   private double IlIIIIiillIIIIii = 12.0;
   public static final double ililiiliIiiliili = 40.0;
   private int iilIIIiiIIiIIIii;
   private final Map<Integer, Long> IliIIIiilliIIIii;
   public static final double liiliiliiiiliili = 4.0;
   private final ArrayDeque<IiiilIiliiilIi> iliIIIiiIiiIIIii;
   public static final int liliiiliiiliiili = 2;
   public static final double iiiiiiliIIIIIIii = 1.0;
   private long liIIIIiiiiIIIIii;
   public static final long iiIiiiliIIliiili = 80L;
   public static final int lliiiiliiliiiili = 4;
   public static final int iIiiiiliIliiiili = 10;
   private double ilIIIIiiIiIIIIii = 4.0;
   public static final double Iilliilililliili = 3.0;
   public static final double lIIIIIiiiIIIIIii = 5.5;
   public static final double Ililiililliliili = 1.0;
   private int IilIIIiililIIIii;
   public static final double lIiliiliiIiliili = 12.0;

   public void liiiIIllIl(long ourReadyInAtBoom, boolean radius, int tick, double cx, double nearUs, double cy, float cz) {
      long var18 = -7845644550320052097L;
      long var20 = 5252752411668057463L;
      this.IliIlllilIi(ourReadyInAtBoom, radius, tick);
      if ((double)cz >= 5.5 && Double.isFinite(cx) && Double.isFinite(nearUs) && Double.isFinite(cy)) {
         var18 ^= ((long)((int)Math.floor(cx)) << 32 ^ var18) & -1L << 32;
         var18 ^= ((long)((int)Math.floor(nearUs + 0.001) - 1) ^ var18) & -1L >>> 32;
         var20 ^= ((long)((int)Math.floor(cy)) << 32 ^ var20) & -1L << 32;
         IiiilIiliiilIi var15 = null;

         for (IiiilIiliiilIi var17 : this.iliIIIiiIiiIIIii) {
            if (var17.iliiIlliiIiiiIllii == (int)(var18 >>> 32) && var17.liiiIlliiiiiiIllii == (int)var18 && var17.IIIIllliilIIIlllii == (int)(var20 >>> 32)) {
               var15 = var17;
               break;
            }
         }

         if (var15 != null) {
            long var22 = ourReadyInAtBoom - var15.llIIllliiilIIlllii;
            if (var22 > 0L) {
               if (var22 <= 60L) {
                  var15.iIIIllliiIlIIlllii++;
                  var15.IiIIllliiliIIlllii = var15.iIIIllliiIlIIlllii == 2
                     ? IIIilIIiiIIi((double)var22, 1.0, 40.0)
                     : IIIilIIiiIIi(var15.IiIIllliiliIIlllii + 0.3 * ((double)var22 - var15.IiIIllliiliIIlllii), 1.0, 40.0);
               } else {
                  var15.iIIIllliiIlIIlllii = 1;
                  var15.IiIIllliiliIIlllii = 6.0;
               }

               var15.llIIllliiilIIlllii = ourReadyInAtBoom;
               this.iliIIIiiIiiIIIii.remove(var15);
               this.iliIIIiiIiiIIIii.addLast(var15);
            }
         } else {
            this.iliIIIiiIiiIIIii.addLast(new IiiilIiliiilIi((int)(var18 >>> 32), (int)var18, (int)(var20 >>> 32), ourReadyInAtBoom));

            while (this.iliIIIiiIiiIIIii.size() > 4) {
               this.iliIIIiiIiiIIIii.pollFirst();
            }
         }
      }
   }

   public void IiIlliIliiIl(double boomInterval, double placeToBreak) {
      if (!this.iIlIIIiiIllIIIii) {
         if (Double.isFinite(boomInterval)) {
            this.IlIIIIiillIIIIii = IIIilIIiiIIi(boomInterval, 3.0, 40.0);
         }

         if (Double.isFinite(placeToBreak)) {
            this.ilIIIIiiIiIIIIii = IIIilIIiiIIi(placeToBreak, 1.0, 40.0);
         }
      }
   }

   public double Illlllllilll() {
      return this.ilIIIIiiIiIIIIii;
   }

   public int IilliliilIIi(long now) {
      iIilIiIiIlilIiIi var3 = this.iIlIlllllill(now);
      if (var3 == null) {
         return 99;
      } else {
         long var4 = Math.max(1L, Math.round(var3.IIlllIlliIll()));
         long var6 = Math.max(0L, now - var3.IiIlliIliiIl());
         long var8 = var6 < var4 ? var4 - var6 : (var4 - var6 % var4) % var4;
         return (int)Math.min(99L, var8);
      }
   }

   public double IIlllIlliIll() {
      return this.IlIIIIiillIIIIii;
   }

   public boolean Iilllilliill() {
      return this.lIiIIIiiiIiIIIii >= 3 && this.IilIIIiililIIIii >= 3;
   }

   public long Ililllililil() {
      return this.liIIIIiiiiIIIIii;
   }

   public iillilIIilil() {
      this.liIIIIiiiiIIIIii = Long.MIN_VALUE;
      this.IIlIIIiilIlIIIii = Long.MIN_VALUE;
      this.lllIIIiiillIIIii = new boolean[5];
      this.IliIIIiilliIIIii = new LinkedHashMap<>();
      this.iliIIIiiIiiIIIii = new ArrayDeque<>();
   }

   public void Iiilliiliiil() {
      this.IlIIIIiillIIIIii = 12.0;
      this.ilIIIIiiIiIIIIii = 4.0;
      this.liIIIIiiiiIIIIii = Long.MIN_VALUE;
      this.IIlIIIiilIlIIIii = Long.MIN_VALUE;
      this.iIlIIIiiIllIIIii = false;
      Arrays.fill(this.lllIIIiiillIIIii, false);
      this.IilIIIiililIIIii = 0;
      this.iilIIIiiIIiIIIii = 0;
      this.lIiIIIiiiIiIIIii = 0;
      this.IliIIIiilliIIIii.clear();
      this.iliIIIiiIiiIIIii.clear();
   }

   public void IliIlllilIi(long ourReadyInAtBoom, boolean nearUs, int tick) {
      long var7 = 2498360923051523872L;
      if (this.liIIIIiiiiIIIIii != Long.MIN_VALUE) {
         long var5 = ourReadyInAtBoom - this.liIIIIiiiiIIIIii;
         if (var5 > 0L && var5 <= 80L) {
            this.IlIIIIiillIIIIii = IIIilIIiiIIi(this.IlIIIIiillIIIIii + 0.3 * ((double)var5 - this.IlIIIIiillIIIIii), 3.0, 40.0);
         }
      }

      this.liIIIIiiiiIIIIii = ourReadyInAtBoom;
      this.iIlIIIiiIllIIIii = true;
      if (nearUs) {
         var7 ^= ((long)(Math.abs(tick) <= 1 ? 1 : 0) << 32 ^ var7) & -1L << 32;
         if (this.lllIIIiiillIIIii[this.iilIIIiiIIiIIIii]) {
            this.IilIIIiililIIIii--;
         }

         this.lllIIIiiillIIIii[this.iilIIIiiIIiIIIii] = (boolean)((int)(var7 >>> 32));
         if ((int)(var7 >>> 32) != 0) {
            this.IilIIIiililIIIii++;
         }

         this.iilIIIiiIIiIIIii = (this.iilIIIiiIIiIIIii + 1) % 5;
         this.lIiIIIiiiIiIIIii++;
      }
   }

   public String lIiiIiIlilli(long now) {
      iIilIiIiIlilIiIi var3 = this.iIlIlllllill(now);
      return var3 == null
         ? IiIiliIiiiIi<"IiIiliIiiiIi","V+p/AbtutjgI7b133EcydRRc0GKGK28A18+JNEM=">()
         : String.format(
            Locale.ROOT,
            IiIiliIiiiIi<"IiIiliIiiiIi","nvHMEpgagkXjoVd3NqCNFNot5TWWqe4k+QozitLWaFxsz4s5+taxWE8DtbP+5uY=">(),
            var3.lIiiIiIlilli(),
            var3.iliIiiliiiii(),
            var3.IIIllIIliIIl(),
            var3.IlIlllIlilIl(),
            var3.IIlllIlliIll(),
            this.IilliliilIIi(now)
         );
   }

   public iIilIiIiIlilIiIi iIlIlllllill(long now) {
      IiiilIiliiilIi var3 = null;

      for (IiiilIiliiilIi var5 : this.iliIIIiiIiiIIIii) {
         if (var5.iIIIllliiIlIIlllii >= 2) {
            long var6 = now - var5.llIIllliiilIIlllii;
            if (var6 >= 0L
               && var6 <= Math.max(10L, Math.round(2.0 * var5.IiIIllliiliIIlllii))
               && (
                  var3 == null
                     || var5.iIIIllliiIlIIlllii > var3.iIIIllliiIlIIlllii
                     || var5.iIIIllliiIlIIlllii == var3.iIIIllliiIlIIlllii && var5.llIIllliiilIIlllii >= var3.llIIllliiilIIlllii
               )) {
               var3 = var5;
            }
         }
      }

      return var3 == null
         ? null
         : new iIilIiIiIlilIiIi(
            var3.iliiIlliiIiiiIllii,
            var3.liiiIlliiiiiiIllii,
            var3.IIIIllliilIIIlllii,
            var3.iIIIllliiIlIIlllii,
            var3.llIIllliiilIIlllii,
            var3.IiIIllliiliIIlllii
         );
   }

   public int IIillIiliIil(long now) {
      long var3 = Long.MAX_VALUE;
      if (this.liIIIIiiiiIIIIii != Long.MIN_VALUE && now - this.liIIIIiiiiIIIIii <= Math.round(3.0 * this.IlIIIIiillIIIIii)) {
         var3 = Math.max(0L, this.liIIIIiiiiIIIIii + Math.round(this.IlIIIIiillIIIIii) - now);
      }

      this.IliIIIiilliIIIii.values().removeIf(nowx -> now - nowx > 100L);

      for (long var6 : this.IliIIIiilliIIIii.values()) {
         long var8 = Math.max(0L, var6 + Math.round(this.ilIIIIiiIiIIIIii) - now);
         if (this.IIlIIIiilIlIIIii != Long.MIN_VALUE && now - this.IIlIIIiilIlIIIii <= 1L) {
            var8 = 0L;
         }

         var3 = Math.min(var3, var8);
      }

      return var3 == Long.MAX_VALUE ? 99 : (int)Math.min(99L, var3);
   }

   public void iliIiiliiiii(int tick, long crystalId) {
      this.IliIIIiilliIIIii.put(tick, crystalId);
      if (this.IliIIIiilliIIIii.size() > 32) {
         Iterator var4 = this.IliIIIiilliIIIii.keySet().iterator();
         var4.next();
         var4.remove();
      }
   }

   private static double IIIilIIiiIIi(double v, double hi, double lo) {
      return v < hi ? hi : Math.min(v, lo);
   }

   public void IlIlllIlilIl(long tick) {
      this.IIlIIIiilIlIIIii = tick;
   }

   public void IIIllIIliIIl(int tick, long crystalId) {
      Long var4 = this.IliIIIiilliIIIii.remove(tick);
      if (var4 != null) {
         long var5 = crystalId - var4;
         if (var5 >= 0L && var5 <= 100L) {
            this.ilIIIIiiIiIIIIii = IIIilIIiiIIi(this.ilIIIIiiIiIIIIii + 0.3 * ((double)var5 - this.ilIIIIiiIiIIIIii), 1.0, 40.0);
            this.iIlIIIiiIllIIIii = true;
         }
      }
   }
}

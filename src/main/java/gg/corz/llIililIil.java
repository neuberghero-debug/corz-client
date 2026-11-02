package gg.corz;

import java.util.ArrayList;
import java.util.Set;
import net.minecraft.class_1661;
import net.minecraft.class_1713;
import net.minecraft.class_1792;
import net.minecraft.class_1799;
import net.minecraft.class_310;
import net.minecraft.class_490;

public final class llIililIil {
   private final class_310 iIiiIliIliiIli;
   public int lIiIlliiIiIlli;
   private boolean liiIlliiiiIlli;
   private int iIIllliIlIllli;
   private static final int lIlllliiIlllli = 4;
   private boolean IIIlllilIIllli;
   private int ilIIlliIiIIlli;
   private final Object lliiIliiliiIli = new Object();
   private static final int IiIllliliIllli = 60;
   private iiiIliiIIIllii llIllliilIllli;
   private class_1792 lIIIlliiIIIlli;
   private int iiiiIliIIIIlli;
   private boolean iliIlliIiiIlli;
   private class_1792 IliIllilliIlli;
   public int iilIlliIIiIlli;
   private IIIliiilIIliii IiiiIliliiiIli = IIIliiilIIliii.lIIiliiIIl;
   private class_1799 IIlIllilIlIlli;
   private final IiiIilllliiIilll liIIlliiiIIlli;
   public int IilIllililIlli;
   private static final int iiIllliIIlllli = 20;
   private class_1799 iIlIlliIllIlli;
   private int lllIlliillIlli;
   private int IlIIllillIIlli = -1;

   private int Iilililiiili(Set<Integer> supportItem, boolean protectSelected, class_1792 reserved, class_1792 currentItem) {
      long var16 = -1032687853136662880L;
      long var18 = -5410636222711511785L;
      long var20 = 5852479725638998506L;
      long var22 = 3612811979064667771L;
      class_1661 var5 = this.iIiiIliIliiIli.field_1724.method_31548();
      var16 ^= ((long)var5.method_67532() << 32 ^ var16) & -1L << 32;
      ArrayList var7 = new ArrayList(9);

      for (long var25 = var16 ^ (0L ^ var16) & -1L >>> 32; (int)var25 <= 8; var25 ^= (var25 ^ var25 + (long)1) & -1L >>> 32) {
         class_1799 var9 = var5.method_5438((int)var25);
         long var26 = var18 ^ ((long)var9.method_7960() << 32 ^ var18) & -1L << 32;
         var18 = var26 ^ ((long)((int)(var26 >>> 32) != 0 || !var9.method_7963() && var9.method_7914() != 1 ? 0 : 1) ^ var26) & -1L >>> 32;
         long var27 = var20 ^ ((long)((int)(var18 >>> 32) == 0 && reserved != null && var9.method_31574(reserved) ? 1 : 0) << 32 ^ var20) & -1L << 32;
         var20 = var27 ^ ((long)((int)(var18 >>> 32) == 0 && currentItem != null && var9.method_31574(currentItem) ? 1 : 0) ^ var27) & -1L >>> 32;
         long var28 = var22 ^ ((long)(protectSelected && (int)var25 == (int)(var25 >>> 32) ? 1 : 0) << 32 ^ var22) & -1L << 32;
         var22 = var28 ^ ((long)(supportItem != null && supportItem.contains((int)var25) ? 1 : 0) ^ var28) & -1L >>> 32;
         var7.add(
            new iiiiiIilIIIIIlil(
               (int)var25,
               (boolean)((int)(var18 >>> 32)),
               (boolean)((int)var22),
               (boolean)((int)(var22 >>> 32)),
               (boolean)((int)var18),
               (boolean)((int)var20),
               (boolean)((int)(var20 >>> 32)),
               (int)(var18 >>> 32) != 0 ? 0 : var9.method_7947(),
               0,
               0
            )
         );
      }

      return llIIllililIIllil.IliIlllilIi(var7);
   }

   public int iIlIlllllill() {
      return this.IlIIllillIIlli;
   }

   private void IiIlliIliiIl() {
      if (this.IIIlllilIIllli && this.iIiiIliIliiIli.field_1755 instanceof class_490 && this.iIiiIliIliiIli.field_1724 != null) {
         this.iIiiIliIliiIli.field_1724.method_7346();
      }
   }

   public IllIlilllllIlill iliIiiliiiii(class_1792 currentItem, Set<Integer> protectSelected, boolean reservedSlots, class_1792 supportItem, class_1792 want) {
      return this.IIIllIIliIIl(currentItem, protectSelected, reservedSlots, supportItem, want, false);
   }

   public IllIlilllllIlill IIIllIIliIIl(
      class_1792 currentItem, Set<Integer> protectSelected, boolean visible, class_1792 reservedSlots, class_1792 supportItem, boolean want
   ) {
      if (this.iIiiIliIliiIli.field_1724 == null) {
         return IllIlilllllIlill.IliIiilill;
      } else if (this.liIIlliiiIIlli.liiiIIllIl(currentItem, this.IlIillIiilIi())) {
         this.iilIlliIIiIlli++;
         return IllIlilllllIlill.IiiIiilill;
      } else {
         this.lIIIlliiIIIlli = currentItem;
         this.IlIIllillIIlli = this.Illillliilli(currentItem);
         if (this.IlIIllillIIlli < 0) {
            return IllIlilllllIlill.IliIiilill;
         } else {
            this.ilIIlliIiIIlli = this.Iilililiiili(protectSelected, visible, reservedSlots, supportItem);
            if (this.ilIIlliIiIIlli < 0) {
               return IllIlilllllIlill.lliIiilill;
            } else if (!lIlillliIlilll.IliIlllilIi(this.lliiIliiliiIli)) {
               return IllIlilllllIlill.iliIiilill;
            } else {
               this.IIIlllilIIllli = want;
               this.iIIllliIlIllli = 4;
               if (want && this.iIiiIliIliiIli.field_1755 == null) {
                  this.iIiiIliIliiIli.method_1507(new class_490(this.iIiiIliIliiIli.field_1724));
               }

               this.IiiiIliliiiIli = IIIliiilIIliii.iIIiliiIIl;
               this.iiiiIliIIIIlli = 0;
               this.iliIlliIiiIlli = false;
               this.liiIlliiiiIlli = false;
               this.llIllliilIllli = iiiIliiIIIllii.lIlIIliIIl;
               return IllIlilllllIlill.iIiIiilill;
            }
         }
      }
   }

   public boolean IiIiliIiiiIi(class_1792 item) {
      return this.liIIlliiiIIlli.liiiIIllIl(item, this.IlIillIiilIi());
   }

   private int IIIilIIiiIIi() {
      long var3 = 9183090245478016436L;
      if (this.iIiiIliIliiIli.field_1724 != null && this.lIIIlliiIIIlli != null) {
         var3 ^= (0L ^ var3) & -1L << 32;

         for (var3 ^= (0L ^ var3) & -1L >>> 32; (int)var3 < 36; var3 ^= (var3 ^ var3 + (long)1) & -1L >>> 32) {
            if (this.iIiiIliIliiIli.field_1724.method_31548().method_5438((int)var3).method_31574(this.lIIIlliiIIIlli)) {
               var3 ^= ((long)((int)(var3 >>> 32) + this.iIiiIliIliiIli.field_1724.method_31548().method_5438((int)var3).method_7947()) << 32 ^ var3)
                  & -1L << 32;
            }
         }

         return (int)(var3 >>> 32);
      } else {
         return 0;
      }
   }

   public iiiIliiIIIllii lIiiIiIlilli() {
      return this.llIllliilIllli;
   }

   public long IlIillIiilIi() {
      long var5 = 8221349111139558725L;
      if (this.iIiiIliIliiIli.field_1724 == null) {
         return 0L;
      } else {
         long var1 = 1L;

         for (long var8 = var5 ^ (0L ^ var5) & -1L << 32; (int)(var8 >>> 32) < 36; var8 += 4294967296L) {
            class_1799 var4 = this.iIiiIliIliiIli.field_1724.method_31548().method_5438((int)(var8 >>> 32));
            var1 = 31L * var1 + (long)class_1799.method_57355(var4);
            var1 = 31L * var1 + (long)var4.method_7947();
         }

         return var1;
      }
   }

   public void IIlilIliiIli() {
      this.Illlllllilll();
      this.liIIlliiiIIlli.IilliliilIIi();
      this.IilIllililIlli = this.iilIlliIIiIlli = this.lIiIlliiIiIlli = 0;
      this.IliIllilliIlli = null;
   }

   public class_1792 IilliliilIIi() {
      return this.lIIIlliiIIIlli;
   }

   private void Ililllililil() {
      long var2 = -3485820714245618142L;
      if (!this.iIiiIliIliiIli.field_1724.method_31548().method_5438(this.IlIIllillIIlli).method_31574(this.lIIIlliiIIIlli)) {
         var2 ^= ((long)this.Illillliilli(this.lIIIlliiIIIlli) << 32 ^ var2) & -1L << 32;
         if ((int)(var2 >>> 32) < 0) {
            this.IiiiIliliiiIli = IIIliiilIIliii.IiIiliiIIl;
            this.llIllliilIllli = iiiIliiIIIllii.IllIIliIIl;
            return;
         }

         this.IlIIllillIIlli = (int)(var2 >>> 32);
      }

      if (!this.liIIlliiiIIlli.IliIlllilIi(this.lIIIlliiIIIlli, this.IlIillIiilIi())) {
         this.iilIlliIIiIlli++;
         this.IiiiIliliiiIli = IIIliiilIIliii.IiIiliiIIl;
         this.llIllliilIllli = iiiIliiIIIllii.IllIIliIIl;
      } else {
         this.IIlIllilIlIlli = this.iIiiIliIliiIli.field_1724.method_31548().method_5438(this.IlIIllillIIlli).method_7972();
         this.iIlIlliIllIlli = this.iIiiIliIliiIli.field_1724.method_31548().method_5438(this.ilIIlliIiIIlli).method_7972();
         this.lllIlliillIlli = this.IIIilIIiiIIi();
         if (this.IliIllilliIlli == this.lIIIlliiIIIlli) {
            this.lIiIlliiIiIlli++;
         }

         this.IliIllilliIlli = null;
         this.IilIllililIlli++;
         this.liiIlliiiiIlli = true;
         if (this.iIiiIliIliiIli.field_1724.method_31549().field_7477) {
            class_1661 var1 = this.iIiiIliIliiIli.field_1724.method_31548();
            var1.method_5447(this.IlIIllillIIlli, this.iIlIlliIllIlli.method_7972());
            var1.method_5447(this.ilIIlliIiIIlli, this.IIlIllilIlIlli.method_7972());
            this.iIiiIliIliiIli.field_1761.method_2909(this.iIlIlliIllIlli.method_7972(), iiilIiIiIIIiIiIi.IliIlllilIi(this.IlIIllillIIlli));
            this.iIiiIliIliiIli.field_1761.method_2909(this.IIlIllilIlIlli.method_7972(), iiilIiIiIIIiIiIi.IliIlllilIi(this.ilIIlliIiIIlli));
         } else {
            this.iIiiIliIliiIli
               .field_1761
               .method_2906(
                  this.iIiiIliIliiIli.field_1724.field_7498.field_7763,
                  iiilIiIiIIIiIiIi.IliIlllilIi(this.IlIIllillIIlli),
                  iiilIiIiIIIiIiIi.iIlIlllllill(this.ilIIlliIiIIlli),
                  class_1713.field_7791,
                  this.iIiiIliIliiIli.field_1724
               );
         }
      }
   }

   public lIilIIiliIilIIil IIlllIlliIll(boolean cleanupActive, boolean placing, boolean confirming, boolean falling, boolean grounded, boolean tempActive) {
      long var12 = 5705136367107554778L;
      long var14 = 123313763647524983L;
      if (this.IiiiIliliiiIli == IIIliiilIIliii.ilIiliiIIl) {
         if (this.IIIlllilIIllli && this.iIIllliIlIllli > 0) {
            this.iIIllliIlIllli--;
            return lIilIIiliIilIIil.lliIllIIil;
         } else {
            this.IiIlliIliiIl();
            lIlillliIlilll.liiiIIllIl(this.lliiIliiliiIli);
            return lIilIIiliIilIIil.iliIllIIil;
         }
      } else if (!this.IliIlllilIi()) {
         return lIilIIiliIilIIil.IiiIllIIil;
      } else if (this.iIiiIliIliiIli.field_1724 != null && this.iIiiIliIliiIli.field_1761 != null) {
         var12 ^= (
               (long)(
                        (this.iIiiIliIliiIli.field_1755 == null || this.IlIlllIlilIl())
                              && this.iIiiIliIliiIli.field_1724.field_7512 == this.iIiiIliIliiIli.field_1724.field_7498
                           ? 0
                           : 1
                     )
                     << 32
                  ^ var12
            )
            & -1L << 32;
         var12 ^= ((long)IiIiilIiliIiilIi.liiiIIllIl(cleanupActive, placing, confirming, falling, grounded, tempActive, (boolean)((int)(var12 >>> 32))) ^ var12)
            & -1L >>> 32;
         var14 ^= (
               (long)(
                        this.liiIlliiiiIlli
                              && this.ilIIlliIiIIlli >= 0
                              && this.liIIlliiiIIlli
                                 .iIlIlllllill(
                                    class_1799.method_7973(this.iIiiIliIliiIli.field_1724.method_31548().method_5438(this.ilIIlliIiIIlli), this.IIlIllilIlIlli),
                                    class_1799.method_7973(this.iIiiIliIliiIli.field_1724.method_31548().method_5438(this.IlIIllillIIlli), this.iIlIlliIllIlli),
                                    this.Iiilliiliiil()
                                 )
                           ? 1
                           : 0
                     )
                     << 32
                  ^ var14
            )
            & -1L << 32;
         var14 ^= ((long)this.IIillIiliIil() ^ var14) & -1L >>> 32;
         iIIliiIlIlii var11 = IiIiilIiliIiilIi.IliIlllilIi(
            this.IiiiIliliiiIli, new lililiiilili((boolean)((int)var12), (boolean)((int)(var14 >>> 32)), (boolean)((int)var14))
         );
         if (var11.iIlIlllllill() != this.IiiiIliliiiIli) {
            this.IiiiIliliiiIli = var11.iIlIlllllill();
            this.iiiiIliIIIIlli = 0;
            this.iliIlliIiiIlli = false;
            if (this.IiiiIliliiiIli == IIIliiilIIliii.IiIiliiIIl) {
               this.llIllliilIllli = var11.IilliliilIIi();
            }
         }

         if (!this.iliIlliIiiIlli && this.IiiiIliliiiIli == IIIliiilIIliii.IlIiliiIIl) {
            this.Ililllililil();
            this.iliIlliIiiIlli = true;
         }

         this.iiiiIliIIIIlli++;
         if (this.IiiiIliliiiIli == IIIliiilIIliii.ilIiliiIIl) {
            if (this.IIIlllilIIllli && this.iIIllliIlIllli > 0) {
               this.iIIllliIlIllli--;
               return lIilIIiliIilIIil.lliIllIIil;
            } else {
               this.IiIlliIliiIl();
               lIlillliIlilll.liiiIIllIl(this.lliiIliiliiIli);
               return lIilIIiliIilIIil.iliIllIIil;
            }
         } else {
            return this.IiiiIliliiiIli == IIIliiilIIliii.IiIiliiIIl ? this.Iilllilliill() : lIilIIiliIilIIil.lliIllIIil;
         }
      } else {
         return this.Iilllilliill();
      }
   }

   public int liiiIIllIl() {
      return this.ilIIlliIiIIlli;
   }

   private boolean IIillIiliIil() {
      return switch (this.IiiiIliliiiIli) {
         case iIIiliiIIl -> this.iiiiIliIIIIlli > 60;
         case llIiliiIIl -> this.iiiiIliIIIIlli > 20;
         default -> false;
      };
   }

   public void Illlllllilll() {
      this.IiIlliIliiIl();
      lIlillliIlilll.liiiIIllIl(this.lliiIliiliiIli);
      this.IiiiIliliiiIli = IIIliiilIIliii.lIIiliiIIl;
      this.lIIIlliiIIIlli = null;
      this.IlIIllillIIlli = this.ilIIlliIiIIlli = -1;
      this.iliIlliIiiIlli = false;
      this.IIIlllilIIllli = false;
   }

   public boolean IlIlllIlilIl() {
      return this.IIIlllilIIllli && this.iIiiIliIliiIli.field_1755 instanceof class_490;
   }

   private int Illillliilli(class_1792 item) {
      long var4 = 791572064157326258L;
      class_1661 var2 = this.iIiiIliIliiIli.field_1724.method_31548();

      for (long var6 = var4 ^ (38654705664L ^ var4) & -1L << 32; (int)(var6 >>> 32) <= 35; var6 += 4294967296L) {
         if (var2.method_5438((int)(var6 >>> 32)).method_31574(item)) {
            return (int)(var6 >>> 32);
         }
      }

      return -1;
   }

   public boolean Iiilliiliiil() {
      return this.IIIilIIiiIIi() == this.lllIlliillIlli;
   }

   public boolean IliIlllilIi() {
      return this.IiiiIliliiiIli != IIIliiilIIliii.lIIiliiIIl
         && this.IiiiIliliiiIli != IIIliiilIIliii.ilIiliiIIl
         && this.IiiiIliliiiIli != IIIliiilIIliii.IiIiliiIIl;
   }

   private lIilIIiliIilIIil Iilllilliill() {
      this.IliIllilliIlli = this.lIIIlliiIIIlli;
      this.IiIlliIliiIl();
      lIlillliIlilll.liiiIIllIl(this.lliiIliiliiIli);
      if (this.IiiiIliliiiIli != IIIliiilIIliii.IiIiliiIIl) {
         this.IiiiIliliiiIli = IIIliiilIIliii.IiIiliiIIl;
      }

      return lIilIIiliIilIIil.IiiIllIIil;
   }

   public llIililIil(class_310 mc) {
      this.ilIIlliIiIIlli = -1;
      this.liIIlliiiIIlli = new IiiIilllliiIilll();
      this.IIlIllilIlIlli = class_1799.field_8037;
      this.iIlIlliIllIlli = class_1799.field_8037;
      this.llIllliilIllli = iiiIliiIIIllii.lIlIIliIIl;
      this.iIiiIliIliiIli = mc;
   }
}

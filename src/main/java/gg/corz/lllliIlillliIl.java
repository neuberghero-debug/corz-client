package gg.corz;

import java.util.ArrayList;
import java.util.List;
import net.minecraft.class_1661;
import net.minecraft.class_1707;
import net.minecraft.class_1713;
import net.minecraft.class_1735;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_1937;
import net.minecraft.class_2248;
import net.minecraft.class_2281;
import net.minecraft.class_2338;
import net.minecraft.class_243;
import net.minecraft.class_2535;
import net.minecraft.class_2561;
import net.minecraft.class_3708;
import net.minecraft.class_3965;
import net.minecraft.class_418;
import net.minecraft.class_465;
import net.minecraft.class_476;
import net.minecraft.class_746;
import net.minecraft.class_239.class_240;

public class lllliIlillliIl extends ilIllIiIll {
   public static final int IiiiIlillliiiIlill = 36;
   private int iilIllillIIiIllill;
   private class_1937 IIlIllilllIlIllill;
   private Runnable lllIllillillIllill;
   public static final double lliiIlilliliiIlill = 0.75;
   private class_243 liIIllilliiIIllill;
   private class_2535 iIlIllillIllIllill;
   private int IliIllilllliIllill;
   private boolean IilIllilllilIllill;
   private liIlllIliiIlllIl IlIIllillllIIllill;
   private class_2338 ilIIllillIiIIllill;
   public static final double iIiiIlillIliiIlill = 4.5;
   private static final int iiiiIlillIIIIllill = 20;
   private final iilliIlIIiliIl IIiiIlilllIiiIlill = new iilliIlIIiliIl(
      IliIlllilIi<"IliIlllilIi","Uej4slm1TGC7Ame3zxtZ80etZiOGqd/WTgMRRsxoe75yTRhK7Ttj">(),
      IliIlllilIi<"IliIlllilIi","Ba9mjAqhFeiQTGzeTyjMS4o9f/SumJyeXj1PLkwq7iNunbqoxBgjbzXi80cgxvEKLi/tSbd1ZpqPq7NAf2avGIRNA1gZyME5hGZ5E+bkY02RvEDh3bNbmpiCHVU6K+odxA==">(),
      2,
      1,
      -(1114889498 << 31 | 1114889498 >>> 1) ^ -557444743
   );
   private final boolean[] lIIIllilliIIIllill = new boolean[-((-1182937990 << 7 | -1182937990 >>> 25) << 9 | (-1182937990 << 7 | -1182937990 >>> 25) >>> 23)
      ^ 864372391];
   private int lIiIllilliIiIllill;

   private boolean IlIllllIll() {
      class_746 var1 = Iiiilllliiilll.field_1724;
      if (this.liIIllilliiIIllill == null) {
         return false;
      } else if (Iiiilllliiilll.field_1687 != this.IIlIllilllIlIllill) {
         return true;
      } else {
         class_243 var2 = var1.method_73189();
         double var3 = var2.field_1352 - this.liIIllilliiIIllill.field_1352;
         double var5 = var2.field_1350 - this.liIIllilliiIIllill.field_1350;
         return Math.sqrt(var3 * var3 + var5 * var5) > Double.longBitsToDouble(-3653542496774954579L ^ -962641719421083219L)
            || Math.abs(var2.field_1351 - this.liIIllilliiIIllill.field_1351) > Double.longBitsToDouble(-3641038601672633144L ^ -970404022641929016L);
      }
   }

   @Override
   protected void Iilililiiili() {
      this.ilillIiill();
      this.IlIIllillllIIllill = null;
      this.iIlIllillIllIllill = null;
   }

   private void lIilliIill() {
      class_746 var1 = Iiiilllliiilll.field_1724;
      if (var1 != null && Iiiilllliiilll.field_1755 instanceof class_465 && var1.field_7512 != var1.field_7498) {
         var1.method_7346();
      }
   }

   private void lllllillll() {
      class_746 var1 = Iiiilllliiilll.field_1724;
      if (var1.field_7512 instanceof class_1707 var2) {
         int var9 = Math.min(var2.method_17388() * 9, var2.field_7761.size());
         int var4 = var2.field_7761.size() - var9;

         for (int var5 = 0; var5 < var4; var5++) {
            int var6 = var9 + Math.floorMod(this.lIiIllilliIiIllill + var5, var4);
            if (this.Iillllilll(var2.method_7611(var6), var1)) {
               this.lIiIllilliIiIllill = var6 - var9 + 1;
               int var7 = var2.field_7763;
               this.Ilillllill(() -> {
                  class_746 var4x = Iiiilllliiilll.field_1724;
                  if (var4x != null && Iiiilllliiilll.field_1761 != null && var4x.field_7512 == var2 && var2.field_7763 == var7) {
                     if (var6 < var2.field_7761.size() && this.Iillllilll(var2.method_7611(var6), var4x)) {
                        Iiiilllliiilll.field_1761.method_2906(var7, var6, 0, class_1713.field_7794, var4x);
                     }
                  }
               });
               return;
            }
         }
      }
   }

   private void ilillIiill() {
      if (this.lllIllillillIllill != null) {
         lIlIiIliIlIiIl.Iiilliiliiil(this.lllIllillillIllill);
      }

      this.lllIllillillIllill = null;
      this.IilIllilllilIllill = false;
   }

   private class_3965 ilIllIiIll() {
      class_746 var1 = Iiiilllliiilll.field_1724;
      if (var1 != null && Iiiilllliiilll.field_1687 != null && !var1.method_5715()) {
         if (Iiiilllliiilll.field_1765 instanceof class_3965 var2 && var2.method_17783() == class_240.field_1332) {
            class_2248 var4 = Iiiilllliiilll.field_1687.method_8320(var2.method_17777()).method_26204();
            if (!(var4 instanceof class_2281) && !(var4 instanceof class_3708)) {
               return null;
            }

            if (var1.method_33571().method_1022(var2.method_17784()) > Double.longBitsToDouble(2065303353373636936L ^ 6682055921381816648L)) {
               return null;
            }

            if (this.ilIIllillIiIIllill != null && !this.ilIIllillIiIIllill.equals(var2.method_17777())) {
               return null;
            }

            return var2;
         }

         return null;
      } else {
         return null;
      }
   }

   @Override
   protected void Illillliilli() {
      this.IlIIllillllIIllill = null;
      this.ilIIllillIiIIllill = null;
      this.liIIllilliiIIllill = null;
      this.IIlIllilllIlIllill = null;
      this.lllIllillillIllill = null;
      this.IilIllilllilIllill = false;
      this.lIiIllilliIiIllill = 0;
      this.IliIllilllliIllill = 0;
      if (Iiiilllliiilll != null) {
         if (Iiiilllliiilll.field_1724 != null
            && Iiiilllliiilll.field_1687 != null
            && Iiiilllliiilll.field_1761 != null
            && Iiiilllliiilll.method_1562() != null) {
            ilIllIiIll var1 = llilIllililIll.iliIiiliiiii(IiiilIIiliiilIIi.class);
            if (var1 != null && var1.IliIlllilIi()) {
               Iiiilllliiilll.method_63588(
                  () -> this.liilliiill(
                        IliIlllilIi<"IliIlllilIi","2oJE3FlEbXKCU+TH8I4jVx9UKJF4QcZVEV8pJaQwB5VTCERz40Czw5ZjiNwP+d5dvd79DbHwaVJ2phu8hq8mSfu4oQKT5r0l7Z3m">(),
                        false
                     )
               );
            } else {
               class_1661 var2 = Iiiilllliiilll.field_1724.method_31548();
               int var3 = 0;

               for (int var4 = 0; var4 < 36; var4++) {
                  this.lIIIllilliIIIllill[var4] = !var2.method_5438(var4).method_7960();
                  if (this.lIIIllilliIIIllill[var4]) {
                     var3++;
                  }
               }

               this.iIlIllillIllIllill = Iiiilllliiilll.method_1562().method_48296();
               this.IlIIllillllIIllill = new liIlllIliiIlllIl(this.IIiiIlilllIiiIlill.Iilllilliill());
            }
         } else {
            Iiiilllliiilll.method_63588(() -> this.liilliiill(null, false));
         }
      }
   }

   public lllliIlillliIl() {
      super(IliIlllilIi<"IliIlllilIi","51GRhXbOTdMAlFsUUIKhAWY/k5pj6hedT0iVUrbofeWA70GxW/3qSdpPmw==">(), lllIllillIll.iIIlIIIiIlIlIIIi);
      this.IlIlllIlilIl(new IilliIllilliIl[]{this.IIiiIlilllIiiIlill});
   }

   private void liilliiill(String good, boolean msg) {
      this.ilillIiill();
      this.IlIIllillllIIllill = null;
      if (this.IliIlllilIi()) {
         try (AutoCloseable var3 = Iliiiiilliiiii.IliIlllilIi().liiiIIllIl()) {
            this.IIillIiliIil(false);
         } catch (Exception var8) {
            this.IlIIllillllIIllill = null;
         }
      }

      if (good != null) {
         this.IIIillIIil(good, msg);
      }
   }

   private void IIIillIIil(String good, boolean msg) {
      if (!IliiliIllliiliIl.iiiIlIIIll()) {
         if (Iiiilllliiilll.field_1724 != null) {
            Iiiilllliiilll.field_1724
               .method_7353(
                  class_2561.method_43470(IliIlllilIi<"IliIlllilIi","b1QmRZuKwWibajKE73f5kQpkNyVL4Ekv7UygKceKLUKUyQU41jUZHdW5zHvJPd8gej4d2w==">() + good),
                  false
               );
         }
      } else {
         Iliiiiilliiiii.IliIlllilIi().iIlIlllllill(IliIlllilIi<"IliIlllilIi","51GRhXbOTdMAlFsUUIKhAWY/k5pj6hedT0iVUrbofeWA70GxW/3qSdpPmw==">(), good, msg);
      }
   }

   private void Ilillllill(Runnable click) {
      this.ilillIiill();
      Runnable var2 = new Runnable() {
         @Override
         public void run() {
            if (lllliIlillliIl.this.lllIllillillIllill == this) {
               lllliIlillliIl.this.IilIllilllilIllill = true;
            }

            click.run();
         }
      };
      this.lllIllillillIllill = var2;
      this.iilIllillIIiIllill = this.IliIllilllliIllill;
      lIlIiIliIlIiIl.iIlIlllllill(var2, false);
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private void liIlliiIll(lIiIiIiiIiIiIi a) {
      switch (<unrepresentable>.liIIlIIiil[a.liiiIIllIl().ordinal()]) {
         case 1:
            this.IIllllIlll();
            break;
         case 2:
            this.iIlllIllll();
            break;
         case 3:
            this.lIilliIill();
            break;
         case 4:
            Iiiilllliiilll.method_1562().method_45730(IliIlllilIi<"IliIlllilIi","n50oQK8qRtjfV7xs8TNbaFN9e5O4JMViHR/vv2DnZZg=">());
            break;
         case 5:
            this.lllllillll();
            break;
         case 6:
            this.iilllIIill();
            break;
         case 7:
            if (a.IilliliilIIi()) {
               this.lIilliIill();
            }

            this.liilliiill(a.iIlIlllllill(), true);
            break;
         case 8:
            if (a.IilliliilIIi()) {
               this.lIilliIill();
            }

            this.liilliiill(a.iIlIlllllill(), false);
      }
   }

   @Override
   protected void iIIIlIlIIl() {
      if (this.IlIIllillllIIllill != null
         && Iiiilllliiilll.field_1724 != null
         && Iiiilllliiilll.field_1687 != null
         && Iiiilllliiilll.field_1761 != null
         && Iiiilllliiilll.method_1562() != null) {
         if (Iiiilllliiilll.method_1562().method_48296() != this.iIlIllillIllIllill) {
            this.liilliiill(
               IliIlllilIi<"IliIlllilIi","V/8PdRTaZdck7+cDka1kNU5Gq/QA4KwSceZlA9mSNWzsk8BqSVQQ1ABldt8s3/hJV3qzNvfLbkvA/XRegXMhB57lnsP4jbZQSUQ=">(), false
            );
         } else {
            this.IliIllilllliIllill++;
            if (this.IilIllilllilIllill) {
               this.lllIllillillIllill = null;
               this.IilIllilllilIllill = false;
            }

            if (this.lllIllillillIllill != null && this.IliIllilllliIllill - this.iilIllillIIiIllill > 20) {
               this.ilillIiill();
            }

            IliiiIilliiiIi var1 = this.IlIIllillllIIllill.IliIlllilIi();
            lIiIiIiiIiIiIi var2 = this.IlIIllillllIIllill.iliIiiliiiii(this.iiiIlIIIll());
            this.liIlliiIll(var2);
         }
      }
   }

   private void iilllIIill() {
      long var5 = 4804254249047743550L;
      class_746 var1 = Iiiilllliiilll.field_1724;
      if (var1.field_7512 instanceof class_1707 var2) {
         var5 ^= ((long)IIliIlillIliIlil.IliIlllilIi(lIIlliIIll(var2)) << 32 ^ var5) & -1L << 32;
         if ((int)(var5 >>> 32) >= 0) {
            var5 ^= ((long)var2.field_7763 ^ var5) & -1L >>> 32;
            this.Ilillllill(() -> {
               class_746 var3 = Iiiilllliiilll.field_1724;
               if (var3 != null && Iiiilllliiilll.field_1761 != null && var3.field_7512 == var2 && var2.field_7763 == sync) {
                  Iiiilllliiilll.field_1761.method_2906(sync, b, 0, class_1713.field_7790, var3);
               }
            });
         }
      }
   }

   private void IIllllIlll() {
      class_746 var1 = Iiiilllliiilll.field_1724;
      class_3965 var2 = this.ilIllIiIll();
      if (var2 != null) {
         if (this.ilIIllillIiIIllill == null) {
            this.ilIIllillIiIIllill = var2.method_17777();
            this.liIIllilliiIIllill = var1.method_73189();
            this.IIlIllilllIlIllill = Iiiilllliiilll.field_1687;
         }

         IiIiiiilliIiiiil.iliIiiliiiii(var2);
      }
   }

   private illiliiIililii iiiIlIIIll() {
      class_746 var1 = Iiiilllliiilll.field_1724;
      lIiIlllliIiIllll var2 = lIiIlllliIiIllll.iiiIilIill;
      int var3 = 0;
      int var4 = 0;
      boolean var5 = false;
      boolean var6 = false;
      boolean var7 = false;
      if (Iiiilllliiilll.field_1755 != null) {
         if (Iiiilllliiilll.field_1755 instanceof class_476 && var1.field_7512 instanceof class_1707 var8) {
            var2 = lIiIlllliIiIllll.IIIlilIill;
            int var15 = Math.min(var8.method_17388() * 9, var8.field_7761.size());

            for (int var10 = 0; var10 < var15; var10++) {
               class_1799 var11 = var8.method_7611(var10).method_7677();
               if (!var11.method_7960()) {
                  var3++;
                  var4 += var11.method_7947();
               }
            }

            List var17 = lIIlliIIll(var8);
            int var19 = IIliIlillIliIlil.IliIlllilIi(var17);
            var5 = IIliIlillIliIlil.liiiIIllIl(Iiiilllliiilll.field_1755.method_25440().getString(), var17);
            var7 = var19 >= 0;
            var6 = IIliIlillIliIlil.iIlIlllllill(var17, var19);
         } else {
            var2 = lIiIlllliIiIllll.lIIlilIill;
         }
      }

      class_1661 var14 = var1.method_31548();
      boolean var16 = false;
      int var18 = 0;
      int var20 = 0;

      for (int var12 = 0; var12 < 36; var12++) {
         class_1799 var13 = var14.method_5438(var12);
         if (var13.method_7960()) {
            var16 = true;
         } else if (!this.lIIIllilliIIIllill[var12]) {
            var18++;
            var20 += var13.method_7947();
         }
      }

      boolean var21 = !var1.method_5805() || Iiiilllliiilll.field_1755 instanceof class_418;
      return new illiliiIililii(
         this.IliIllilllliIllill,
         var2,
         var5,
         this.IlIllllIll(),
         var21,
         this.ilIllIiIll() != null,
         var3,
         var4,
         var16,
         var18,
         var20,
         var6,
         var7,
         this.lllIllillillIllill != null
      );
   }

   private boolean Iillllilll(class_1735 slot, class_746 p) {
      long var4 = -2061467493409163453L;
      if (slot != null && slot.field_7871 == p.method_31548()) {
         var4 ^= ((long)slot.method_34266() << 32 ^ var4) & -1L << 32;
         return (int)(var4 >>> 32) >= 0
            && (int)(var4 >>> 32) < (-((-1543412743 ^ -7) * -266059921) ^ -11 ^ 2076812241)
            && !this.lIIIllilliIIIllill[(int)(var4 >>> 32)]
            && !slot.method_7677().method_7960();
      } else {
         return false;
      }
   }

   private void iIlllIllll() {
      class_746 var1 = Iiiilllliiilll.field_1724;
      if (var1.field_7512 instanceof class_1707 var2) {
         int var7 = Math.min(var2.method_17388() * 9, var2.field_7761.size());

         for (int var4 = 0; var4 < var7; var4++) {
            if (!var2.method_7611(var4).method_7677().method_7960()) {
               int var5 = var2.field_7763;
               int var6 = var4;
               this.Ilillllill(() -> {
                  class_746 var3 = Iiiilllliiilll.field_1724;
                  if (var3 != null && Iiiilllliiilll.field_1761 != null && var3.field_7512 == var2 && var2.field_7763 == var5) {
                     if (var6 < var2.field_7761.size() && !var2.method_7611(var6).method_7677().method_7960()) {
                        Iiiilllliiilll.field_1761.method_2906(var5, var6, 0, class_1713.field_7794, var3);
                     }
                  }
               });
               return;
            }
         }
      }
   }

   private static List<liiIilliiiIill> lIIlliIIll(class_1707 g) {
      int var1 = Math.min(g.method_17388() * 9, g.field_7761.size());
      ArrayList var2 = new ArrayList(var1);

      for (int var3 = 0; var3 < var1; var3++) {
         class_1799 var4 = g.method_7611(var3).method_7677();
         if (var4.method_7960()) {
            var2.add(liiIilliiiIill.IIIIliIIilIIIliIIi);
         } else {
            boolean var5 = var4.method_31574(class_1802.field_8581) || var4.method_31574(class_1802.field_8656);
            var2.add(new liiIilliiiIill(false, var4.method_7964().getString(), var5));
         }
      }

      return var2;
   }
}

package gg.corz;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.atomic.AtomicInteger;
import net.minecraft.class_1109;
import net.minecraft.class_2824;
import net.minecraft.class_2960;
import net.minecraft.class_310;
import net.minecraft.class_332;
import net.minecraft.class_3414;
import net.minecraft.class_742;

public class IiiIiiIlliiIiiIl extends ilIllIiIll implements IiIiilliIiil {
   private final lliliIIiililiIIi llliIlIlll = new lliliIIiililiIIi(
      IliIlllilIi<"IliIlllilIi","ZoJa0MIOGrNLy5WDHPVUhpz7JFn+W8E20Rz6a2AWCxNpPu+0">(),
      IliIlllilIi<"IliIlllilIi","l9BlLohwu97oCtIky5FSF74xNMoMiYYKE2D+l54dZoHx9aK7aHwdSjmT0h864i9p0JJ3VhKGips=">(),
      iIIlliIlIlIlliIl.iIliliiIll.get(0).liiiIIllIl(),
      iIIlliIlIlIlliIl.IliIlllilIi()
   );
   private final ililliIiIiilliIi illiIlIlll = new ililliIiIiilliIi(
      IliIlllilIi<"IliIlllilIi","BaU5Lxo9iAIQ9On4vjnK/DWt5C/SkwNfheOLV4PYIdR9Sfc=">(),
      IliIlllilIi<"IliIlllilIi","aJgpVFHXGrkWdnfD2D2ToD5RXZSRDMDBjs9aJDWN8UQpeoPo+dYeWfNmzb2VgHykaUyfcz9ACQ==">(),
      IliIlllilIi<"IliIlllilIi","BaU5Lxo9iAIQ9On4vjnK/DWt5C/SkwNfheOLV4PYIdR9Sfc=">(),
      this::lllllillll
   );
   private static final int lIliIlIlll = 5;
   private final iiIiiilIIliiil liliIlIlll;
   private volatile Set<Integer> IliiIlIlll;
   private final iillIlIIilIl iiliIlIlll;
   private final AtomicInteger IIiiIlIlll;
   public static final int iIliIlIlll = -2;
   private static final int IIliIlIlll = 16;
   private static final int iiIiIlIlll = 4;
   private int iIiiIlIlll;
   public static int IlliIlIlll = -1;
   private int lIiiIlIlll;
   private final iiIiiilIIliiil IiliIlIlll = new iiIiiilIIliiil(
      IliIlllilIi<"IliIlllilIi","DlGjdGfByvJU5zCb81d33/NZ3KNgAXIZWgBABLlEltO8IZJxMkDnHDIabSv+">(),
      IliIlllilIi<"IliIlllilIi","Op8K4WuDU1cMKbCrNy9P7CMt6GIGGKI5wFfHaQekmv+0qgsjfThvmEEPhuGZsKtaMzAl1cY9K3G/TDhsK+ShalZVxEQKv53h5S+xw+v66br9yXQLRMAMXZuR4s5A/Y8o1A8cGWaELAyE/gsNqvE5ChgcrrKfDIkttqY02bxXyIR6">(),
      false
   );

   @Override
   public void iiiIlIIIll(class_332 y, int w, int x, int ctx, int h) {
      this.iiliIlIlll.IliIlllilIi(y, w, x, ctx, h, this.iIlllIllll());
   }

   @Override
   public void ilIllIiIll() {
      this.iiliIlIlll.IilliliilIIi();
   }

   public llllIlilllIl IIllllIlll() {
      return iIIlliIlIlIlliIl.iIliliiIll.get(this.iIlllIllll());
   }

   private void lllllillll() {
      long var3 = -2638493399443875352L;
      var3 ^= ((long)iIIlliIlIlIlliIl.iIliliiIll.size() << 32 ^ var3) & -1L << 32;
      if ((int)(var3 >>> 32) > (~(1056761937 * 1022611261 * 1875962727) * 96516119 ^ 377750621)) {
         var3 ^= ((long)ThreadLocalRandom.current().nextInt((int)(var3 >>> 32) - 1) ^ var3) & -1L >>> 32;
         if ((int)var3 >= this.iIlllIllll()) {
            var3 ^= (var3 ^ var3 + (long)1) & -1L >>> 32;
         }

         this.llliIlIlll.Iiilliiliiil((int)var3);
      }
   }

   public int iIlllIllll() {
      return Math.floorMod(this.llliIlIlll.Ililllililil(), iIIlliIlIlIlliIl.iIliliiIll.size());
   }

   @Override
   public void IlIllllIll(double my, double mx) {
      this.iiliIlIlll.iIlIlllllill(my, mx);
   }

   @Override
   protected void Illillliilli() {
      iiiliiIiIIIiiiIi.IliIlllilIi();
      this.IIllllIlll().IIlllIlliIll();
   }

   private void Iillllilll() {
      if (this.IiliIlIlll.Iilllilliill() && Iiiilllliiilll.field_1687 != null && Iiiilllliiilll.field_1724 != null) {
         ArrayList var1 = new ArrayList();

         for (class_742 var3 : Iiiilllliiilll.field_1687.method_18456()) {
            if (var3 != Iiiilllliiilll.field_1724) {
               var1.add(var3);
            }
         }

         var1.sort(Comparator.comparingDouble(p -> p.method_5858(Iiiilllliiilll.field_1724)));
         HashSet var5 = new HashSet();

         for (int var6 = 0; var6 < Math.min(16, var1.size()); var6++) {
            class_742 var4 = (class_742)var1.get(var6);
            var5.add(var4.method_5628());
            iIIlliIlIlIlliIl.iIliliiIll.get(Math.floorMod(var4.method_5667().hashCode(), iIIlliIlIlIlliIl.iIliliiIll.size())).IIlllIlliIll();
         }

         this.IliiIlIlll = var5;
      } else {
         this.IliiIlIlll = Set.of();
      }
   }

   public IiiIiiIlliiIiiIl() {
      super(IliIlllilIi<"IliIlllilIi","toAkgx6pymVy/1mMnvovzNxlbpgwoVF0pW+cjY6p4fnw1uCdssc=">(), lllIllillIll.IiIlIIIiliIlIIIi);
      this.liliIlIlll = new iiIiiilIIliiil(
         IliIlllilIi<"IliIlllilIi","Kb5DGh25KZgIEYu+vxBfgTbd5vnFJQbp5Rg7S4RZN1r6esq3uQ0zng==">(),
         IliIlllilIi<"IliIlllilIi","gt+7N4SLAiBojK0te47C+mj9Eh79ysYC/YSnYe/avPk48v50gwPOXop2kQ2IU5iHp7QM3NsBw797VSlvCu50ZoD/iuCM6RWGycTAtgYQ2XrKewBRY7sNiwsXCiG6z5AACw==">(),
         true
      );
      this.iiliIlIlll = new iillIlIIilIl();
      this.IIiiIlIlll = new AtomicInteger();
      this.IliiIlIlll = Set.of();
      this.IlIlllIlilIl(new IilliIllilliIl[]{this.llliIlIlll, this.illiIlIlll, this.IiliIlIlll, this.liliIlIlll});
   }

   @Override
   protected void iIIIlIlIIl() {
      this.IIllllIlll().IIlllIlliIll();
      if (this.iIiiIlIlll-- <= 0) {
         this.iIiiIlIlll = 4;
         this.Iillllilll();
      }

      if (this.IIiiIlIlll.get() > 0) {
         if (this.lIiiIlIlll > 0) {
            this.lIiiIlIlll--;
         } else {
            this.IIiiIlIlll.decrementAndGet();
            this.lIiiIlIlll = 3;
            llllIlilllIl var1 = this.IIllllIlll();
            String var2 = var1.iliIiiliiiii();
            if (var2 != null && Iiiilllliiilll.field_1724 != null) {
               try {
                  Iiiilllliiilll.method_1483()
                     .method_4873(class_1109.method_4757(class_3414.method_47908(class_2960.method_60656(var2)), var1.IIIllIIliIIl(), 0.7F));
               } catch (Throwable var4) {
                  this.IIiiIlIlll.set(0);
               }
            } else {
               this.IIiiIlIlll.set(0);
            }
         }
      }
   }

   @Override
   protected void Iilililiiili() {
      this.IIiiIlIlll.set(0);
      this.IliiIlIlll = Set.of();
   }

   public static llllIlilllIl liIlliiIll(class_742 player) {
      long var4 = -1475311716019958660L;
      if (player != null && !iIIlliIlIlIlliIl.iIliliiIll.isEmpty()) {
         if (llilIllililIll.iliIiiliiiii(IiiIiiIlliiIiiIl.class) instanceof IiiIiiIlliiIiiIl var2) {
            var4 ^= ((long)(player == class_310.method_1551().field_1724 ? 1 : 0) << 32 ^ var4) & -1L << 32;
            if ((int)(var4 >>> 32) != 0 && IlliIlIlll >= 0) {
               return iIIlliIlIlIlliIl.iIliliiIll.get(Math.floorMod(IlliIlIlll, iIIlliIlIlIlliIl.iIliliiIll.size()));
            } else if ((int)(var4 >>> 32) != 0 && IlliIlIlll == (965657889 - 79 - 65 ^ -965657745)) {
               return null;
            } else if (!var2.IliIlllilIi()) {
               return null;
            } else if ((int)(var4 >>> 32) != 0) {
               return var2.IIllllIlll();
            } else {
               return var2.IiliIlIlll.Iilllilliill() && var2.IliiIlIlll.contains(player.method_5628())
                  ? iIIlliIlIlIlliIl.iIliliiIll.get(Math.floorMod(player.method_5667().hashCode(), iIIlliIlIlIlliIl.iIliliiIll.size()))
                  : null;
            }
         } else {
            return null;
         }
      } else {
         return null;
      }
   }

   @Override
   protected void llIIlilIIl(IiIiIlIiliIiIlIi event) {
      if (this.liliIlIlll.Iilllilliill()) {
         if (event.lIiilIIIIi instanceof class_2824 var2 && IIIliiIilIIliiIi.IliIlllilIi(var2)) {
            if (this.IIllllIlll().iliIiiliiiii() == null) {
               return;
            }

            if (this.IIiiIlIlll.get() == 0) {
               this.IIiiIlIlll.set(Math.max(1, this.IIllllIlll().IlIlllIlilIl()));
            }
         }
      }
   }

   @Override
   public boolean lIIlliIIll(double h, double w, int x, int my, int button, int y, int mx) {
      return this.iiliIlIlll.liiiIIllIl(h, w, x, my, button, y, mx);
   }
}

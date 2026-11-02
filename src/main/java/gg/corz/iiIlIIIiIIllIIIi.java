package gg.corz;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.function.Predicate;
import net.minecraft.class_11473;
import net.minecraft.class_11908;
import net.minecraft.class_1937;
import net.minecraft.class_2535;
import net.minecraft.class_2708;
import net.minecraft.class_332;
import net.minecraft.class_339;
import net.minecraft.class_364;
import net.minecraft.class_4069;
import net.minecraft.class_418;
import net.minecraft.class_4264;
import net.minecraft.class_437;
import net.minecraft.class_465;
import net.minecraft.class_481;
import net.minecraft.class_634;
import net.minecraft.class_640;
import net.minecraft.class_742;
import net.minecraft.class_7439;
import net.minecraft.class_746;

public class iiIlIIIiIIllIIIi extends ilIllIiIll implements IIiIliilIiIlii {
   private class_2535 iiiiIIliil;
   private String llIIlIliil;
   private class_437 IiIIlIliil;
   private final iilliIlIIiliIl lIiiIIliil;
   private final iilliIlIIiliIl iIiiIIliil;
   private volatile IlillIIillillIIi IIlIlIliil;
   private long liIIlIliil;
   private static final ConcurrentLinkedQueue<String> IiliIIliil = new ConcurrentLinkedQueue<>();
   public static final String iIliIIliil = "You left the server";
   private String lIIIlIliil;
   public static final long IlliIIliil = 8000L;
   public static final long llliIIliil = 350L;
   private final lIIiiIIiiIIiiIIi IiiiIIliil;
   private static volatile iiIlIIIiIIllIIIi liliIIliil;
   public static final int illiIIliil = 8;
   private final iilliIlIIiliIl IIiiIIliil;
   private Set<String> iIIIlIliil;
   public static final int lIliIIliil = 32;
   private final IIiiIIIllIiiIIIl iiliIIliil = new IIiiIIIllIiiIIIl(
      IliIlllilIi<"IliIlllilIi","EC2/hVjSeszCTueok3e0aJ8EK5witJuy2Az+oSgpL8RWiKvDdA==">(),
      IliIlllilIi<"IliIlllilIi","PNnm1lGbcZ05NzisQU1neBsMUwreWz5evXw3SklH1xLzq5wIKoIXPBJGRrlWemPxVWf9QXvtOL5e4pF/lwrP9VZcYeWR9Azgu1mvMilHQ2TfxViW4Fz5Fh6z8Xh0Sg8X5RahqtIwdWA2tSk6e1U=">(),
      ""
   );
   private final llIiIIililIiIIil liiiIIliil;
   private final iiIiiilIIliiil lliiIIliil;
   private boolean iiIIlIliil;
   private long ilIIlIliil;
   private final IIiiIIIllIiiIIIl iliiIIliil;
   private class_1937 IIIIlIliil;
   private final iiIiiilIIliiil IliiIIliil;
   private volatile boolean IlIIlIliil;

   private static boolean Iillllilll(class_437 s) {
      ArrayList var1 = new ArrayList();
      iilllIIill(s, var1, 0);
      class_4264 var2 = null;

      for (class_364 var4 : var1) {
         if (var4 instanceof class_4264) {
            class_4264 var5 = (class_4264)var4;
            if (var5.field_22763 && var5.field_22764) {
               String var6 = iiilliilIIIiliil.IliIlllilIi(var5.method_25369().getString());
               if (var6.contains(IliIlllilIi<"IliIlllilIi","AgwKQKNxQUFejlFWycFQRWnugczWD6IHNbUguC/lUw+b228=">())
                  && !var6.contains(IliIlllilIi<"IliIlllilIi","PFdwhpxaZKTQqvXbgTFzxrIbM9yUQV0BU5XNT+31O8RKHA==">())) {
                  if (var2 != null && var2 != var5) {
                     return false;
                  }

                  var2 = var5;
               }
            }
         }
      }

      return var2 != null && var2.method_25404(new class_11908(257, 0, 0));
   }

   private static Collection<String> liilliiill(class_634 h) {
      ArrayList var1 = new ArrayList();

      for (class_640 var3 : h.method_2880()) {
         if (var3 != null && var3.method_2966() != null) {
            var1.add(var3.method_2966().name());
         }
      }

      return var1;
   }

   public static void lIIlliIIll(String line) {
      if (liliIIliil != null && line != null && !line.isBlank()) {
         while (IiliIIliil.size() >= 32) {
            IiliIIliil.poll();
         }

         IiliIIliil.offer(line);
      }
   }

   public void IlIllllIll(class_332 ctx) {
      if (ctx != null && Iiiilllliiilll.field_1724 != null) {
         this.liiiIIliil.liiiIIllIl(ctx, this.IIlIlIliil, this.IiiiIIliil.Ilillllill(), this.IiiiIIliil.ilillIiill());
      }
   }

   @Override
   public IlillIIillillIIi liIlliiIll() {
      return this.IliIlllilIi() ? this.IIlIlIliil : IlillIIillillIIi.lIiIIIiiil;
   }

   private void ilIllIiIll(String command) {
      class_634 var2 = Iiiilllliiilll.method_1562();
      if (var2 != null && command != null && !command.isBlank()) {
         var2.method_45730(command);
         String var3 = command.trim();
         if (var3.regionMatches(
            true,
            0,
            IliIlllilIi<"IliIlllilIi","MjS0sauV1j0UIBlMHKbn+kmYpKOvzLctxGaJQyDav9W4yEER">(),
            0,
            -((1552411621 << 3 | 1552411621 >>> 29) << 7 | (1552411621 << 3 | 1552411621 >>> 29) >>> 25) ^ -531600762
         )) {
            this.llIIlIliil = var3.substring(
                  (
                        (-1227229749 * -1108378657 << 31 | -1227229749 * -1108378657 >>> 1) << 25
                           | (-1227229749 * -1108378657 << 31 | -1227229749 * -1108378657 >>> 1) >>> 7
                     )
                     ^ -715621716
               )
               .trim();
            this.ilIIlIliil = System.currentTimeMillis();
         }
      }
   }

   private static void iilllIIill(class_4069 out, List<class_364> parent, int depth) {
      if (depth <= 8) {
         for (class_364 var4 : out.method_25396()) {
            parent.add(var4);
            if (var4 instanceof class_4069 var5) {
               iilllIIill(var5, parent, depth + 1);
            }
         }
      }
   }

   @Override
   protected void Iliilliiilii(lIiIlliiIiIlli e) {
      if (e != null && Iiiilllliiilll.field_1755 == null && !Iiiilllliiilll.field_1690.field_1842 && Iiiilllliiilll.field_1724 != null) {
         this.liiiIIliil.liiiIIllIl(e.IIiIilIIIl, this.IIlIlIliil, this.IiiiIIliil.Ilillllill(), this.IiiiIIliil.ilillIiill());
      }
   }

   @Override
   protected void iIIIlIlIIl() {
      class_746 var1 = Iiiilllliiilll.field_1724;
      class_634 var2 = Iiiilllliiilll.method_1562();
      if (var1 != null && var2 != null && Iiiilllliiilll.field_1687 != null) {
         class_2535 var3 = var2.method_48296();
         if (this.iiiiIIliil == null) {
            this.iiiiIIliil = var3;
         } else if (this.iiiiIIliil != var3) {
            this.lIilliIill(IliIlllilIi<"IliIlllilIi","oWPcB1KoJ2yl+1d/+L51B/VI1NZ/kCR8TfnBb1S6H6+ZQiAStIUnpbJHaod559Q=">());
            return;
         }

         long var4;
         boolean var6;
         boolean var7;
         boolean var9;
         boolean var10;
         boolean var10000;
         label85: {
            var4 = System.currentTimeMillis();
            var6 = Iiiilllliiilll.field_1687 != this.IIIIlIliil;
            this.IIIIlIliil = Iiiilllliiilll.field_1687;
            var7 = this.IlIIlIliil;
            this.IlIIlIliil = false;
            class_437 var8 = Iiiilllliiilll.field_1755;
            var9 = var1.method_29504() || var1.method_6032() <= 0.0F || var8 instanceof class_418;
            var10 = var8 != null && !(var8 instanceof class_418);
            boolean var11 = this.iIlllIllll(var8, var4);
            label59:
            if (var11 || !(var8 instanceof class_11473)) {
               if (var8 instanceof class_465 var13 && !(var8 instanceof class_481) && var13.method_17577() != var1.field_7498) {
                  break label59;
               }

               var10000 = false;
               break label85;
            }

            var10000 = true;
         }

         boolean var12 = var10000;
         IIIiIiillIIiIiil var19 = new IIIiIiillIIiIiil(
            Iiiilllliiilll.field_1687.method_27983().method_29177().toString(), var1.method_23317(), var1.method_23318(), var1.method_23321()
         );
         lIIliiliIIliil var14 = this.Ilillllill();
         IIIIIllIIIIl var15 = new IIIIIllIIIIl(
            var4,
            var9,
            var10,
            var12,
            var19,
            var7,
            var6,
            Iiiilllliiilll.method_1548().method_1676(),
            () -> liilliiill(var2),
            this.IIIillIIil(var1),
            iIIilIlIil()
         );

         llIlIllilIlIll var16;
         try {
            var16 = this.IiiiIIliil.IIlllIlliIll(var15, var14);
         } catch (RuntimeException var18) {
            this.lIilliIill(IliIlllilIi<"IliIlllilIi","Yj3dVUyBGYTiX2Z0F+sx51QgxawqBIQvdxNJU+jNoQLgpD7xQd4OPXcXgfwkipqAyzuAq1cnaeVVnk5z">());
            return;
         }

         switch (var16.IliIlllilIi()) {
            case IIiiiiIlIi:
               this.ilIllIiIll(var16.liiiIIllIl());
               break;
            case lIiiiiIlIi:
               var1.method_7331();
               break;
            case iIiiiiIlIi:
               this.lIilliIill(var16.liiiIIllIl());
               return;
         }

         this.IIlIlIliil = this.IiiiIIliil.IiiIlliiIl(var4, var14);
      }
   }

   private void lIilliIill(String reason) {
      AutoCloseable var2 = Iliiiiilliiiii.IliIlllilIi().liiiIIllIl();

      try {
         this.IIillIiliIil(false);
      } finally {
         try {
            var2.close();
         } catch (Exception var9) {
         }
      }

      Iliiiiilliiiii.IliIlllilIi().iIlIlllllill(this.IilliliilIIi(), reason, false);
   }

   private static String lllllillll(class_437 s) {
      StringBuilder var1 = new StringBuilder(s.method_25440().getString());
      ArrayList var2 = new ArrayList();
      iilllIIill(s, var2, 0);

      for (class_364 var4 : var2) {
         if (var4 instanceof class_339) {
            class_339 var5 = (class_339)var4;
            if (!(var5 instanceof class_4264)) {
               var1.append(' ').append(var5.method_25369().getString());
            }
         }
      }

      return var1.toString();
   }

   private void IIllllIlll() {
      this.llIIlIliil = null;
      this.ilIIlIliil = 0L;
      this.IiIIlIliil = null;
      this.iiIIlIliil = false;
   }

   public static boolean iiiIlIIIll() {
      return liliIIliil != null;
   }

   @Override
   protected void Illillliilli() {
      IiliIIliil.clear();
      this.iiiiIIliil = null;
      this.IlIIlIliil = false;
      this.IIIIlIliil = Iiiilllliiilll.field_1687;
      this.liiiIIliil.IliIlllilIi();
      this.IIllllIlll();
      this.IiiiIIliil.IIIllIIliIIl(Iiiilllliiilll.field_1687 != null && Iiiilllliiilll.field_1724 != null);
      liliIIliil = this;
      this.IIlIlIliil = this.IiiiIIliil.IiiIlliiIl(System.currentTimeMillis(), this.Ilillllill());
   }

   private lIIliiliIIliil Ilillllill() {
      return new lIIliiliIIliil(
         this.iiliIIliil.Iilllilliill(),
         this.IIiiIIliil.Iilllilliill(),
         this.lIiiIIliil.Iilllilliill(),
         this.iIiiIIliil.Iilllilliill(),
         this.IliiIIliil.Iilllilliill(),
         this.ilillIiill()
      );
   }

   public iiIlIIIiIIllIIIi() {
      super(IliIlllilIi<"IliIlllilIi","Sj+6GL0auOxvl8YblXxBXg/PXw/1AzuUGm0XA2O9pKFB2EUfpwHikx0=">(), lllIllillIll.lIllIIIiiIllIIIi);
      this.IIiiIIliil = new iilliIlIIiliIl(
         IliIlllilIi<"IliIlllilIi","MrPItaapWDsi/1FGvenltcnTlzFxEAwJL2WOoXr3GFRHxUfkZxv9taGVG4s=">(),
         IliIlllilIi<"IliIlllilIi","5VToCZEJU5ZEbEC689DWNWsKcFtC+znwQ3mxVSW2BE56DCi+1EKilUhpKYjBx/Y5YilJkAsUFiwOaXli80abG90W">(),
         10,
         3,
         60,
         1
      );
      this.lIiiIIliil = new iilliIlIIiliIl(
         IliIlllilIi<"IliIlllilIi","7g1JUAeBk5fhaVKwbK6MSZHMeyDXVkWz49aE8qwH8GfzmV6SusjxtH3kwg==">(),
         IliIlllilIi<"IliIlllilIi","sw12rxpvg6cPL1sOM4yFW5nMgkw0i58a3Yg1X+Hq62qODdjNsrt/bh6knBs3Xt0jDwViJysFOIjvXhnY52m4qX3zdt58XN2jTPM=">(),
         10,
         1,
         60,
         1
      );
      this.iIiiIIliil = new iilliIlIIiliIl(
         IliIlllilIi<"IliIlllilIi","VZx8B8b2pxc5Rlx5+DafrvlIG7W1Iv+TKeUEIsBYDdUMU329G7y+QTsUvLw=">(),
         IliIlllilIi<"IliIlllilIi","UHb5OTafzVPb4cASD7WwT97dTP4yeM1xOGqHevVvs3E/a4i1n6dyFcAWdxF9HLdC1LbwQHuUUUbZjFJIKfzBiCRVZy7oMavqzhqDEPX1UI6UomyPPQ7WemWTPJgZ3w2npRva">(),
         15,
         5,
         60,
         1
      );
      this.IliiIIliil = new iiIiiilIIliiil(
         IliIlllilIi<"IliIlllilIi","7y0A6AdCwA9hZs/96QwwV9fx7zQWsUHHYUvODmJ6osqIr05Mf2EPUVQIgA==">(),
         IliIlllilIi<"IliIlllilIi","JhocgKjkILD9IvreeUJRGbrXDtHFISyZFNaTrEvNKolldFz07M4BzYfteyW0ISRX4+RMpR2LHqzUAFJr3yf5LUqU7L+HylstpL36IHRCWiFbx1lU5kL/m9+/rUXrIDIEklonrSw5ZcjsBJW3DDu/UpELGVFWf/s+AMjWpQ==">(),
         false
      );
      this.lliiIIliil = new iiIiiilIIliiil(
         IliIlllilIi<"IliIlllilIi","wFkrlRMw6IAsarEsPYddg4nF6O3Ln7MdI1tnYgdQKatmM6u+GbkRUnU0">(),
         IliIlllilIi<"IliIlllilIi","oACxFUplL55DpdPEglpcOX36x7abgMOyrQfYwh4NApNVNznSMvklswDSEwulUFGzr4rJIW3Rt/22c4fBubQ9lRjEOzXq0yOGrkYgAUk6ahZVcA==">(),
         true
      );
      this.iliiIIliil = new IIiiIIIllIiiIIIl(
         IliIlllilIi<"IliIlllilIi","dQOPPfFPVcy4IrAwnnFZGjCuvn/1XfEgjDCzjuIK0SkR2sDSA0yJpA==">(),
         IliIlllilIi<"IliIlllilIi","Pf/gcVZPZXa6rtFw74ZXTZf1loPGMwHDT4+qLZQ4N7OK2zayaQgjGjbzcmlxafIkOIKbaSd/GVEWpHwUvoW/hSdxRCKVALtBl4K/UeL71l8=">(),
         ""
      );
      this.IiiiIIliil = new lIIiiIIiiIIiiIIi(new Random());
      this.liiiIIliil = new llIiIIililIiIIil();
      this.iIIIlIliil = Set.of();
      this.IIlIlIliil = IlillIIillillIIi.lIiIIIiiil;
      this.IlIlllIlilIl(
         new IilliIllilliIl[]{this.iiliIIliil, this.IIiiIIliil, this.lIiiIIliil, this.iIiiIIliil, this.IliiIIliil, this.lliiIIliil, this.iliiIIliil}
      );
   }

   private Predicate<String> ilillIiill() {
      String var1 = this.iliiIIliil.Iilllilliill();
      if (var1 == null) {
         var1 = "";
      }

      if (!var1.equals(this.lIIIlIliil)) {
         HashSet var2 = new HashSet();

         for (String var6 : var1.split(IliIlllilIi<"IliIlllilIi","dgI8Q08+zQ/7lDHY+OLijeA6/Qe7uVxJ8e8F69VUGG4VWg==">())) {
            String var7 = var6.trim();
            if (!var7.isEmpty()) {
               var2.add(lllliiIlillliiIl.liiiIIllIl(var7));
            }
         }

         this.lIIIlIliil = var1;
         this.iIIIlIliil = Set.copyOf(var2);
      }

      Set var8 = this.iIIIlIliil;
      boolean var9 = this.lliiIIliil.Iilllilliill();
      return n -> var8.contains(lllliiIlillliiIl.liiiIIllIl(n)) || var9 && iIIiIiIlIlIiIiIl.IliIlllilIi(n);
   }

   private boolean iIlllIllll(class_437 open, long now) {
      if (!(open instanceof class_11473)) {
         return false;
      } else if (open != this.IiIIlIliil) {
         if (this.llIIlIliil != null
            && now - this.ilIIlIliil <= (-5501328937772148905L ^ -5501328937772152809L)
            && iiilliilIIIiliil.IiIlliIliiIl(lllllillll(open), this.llIIlIliil)) {
            this.IiIIlIliil = open;
            this.liIIlIliil = now;
            this.iiIIlIliil = false;
            return true;
         } else {
            return false;
         }
      } else {
         if (!this.iiIIlIliil && now - this.liIIlIliil >= (7048368664171824079L ^ 7048368664171823761L) && Iillllilll(open)) {
            this.iiIIlIliil = true;
            this.llIIlIliil = null;
         }

         return true;
      }
   }

   @Override
   protected void Iilililiiili() {
      liliIIliil = null;
      IiliIIliil.clear();
      this.IiiiIIliil.IlIlllIlilIl();
      this.iiiiIIliil = null;
      this.IIIIlIliil = null;
      this.IIllllIlll();
      this.IIlIlIliil = IlillIIillillIIi.lIiIIIiiil;
   }

   @Override
   protected void IiIIlliIIl(IliIliIllliIliIl e) {
      if (e.iilIIiiIll instanceof class_2708) {
         this.IlIIlIliil = true;
      } else if (e.iilIIiiIll instanceof class_7439 var2 && var2.comp_906() && var2.comp_763() != null) {
         lIIlliIIll(var2.comp_763().getString());
      }
   }

   private static List<String> iIIilIlIil() {
      if (IiliIIliil.isEmpty()) {
         return List.of();
      } else {
         ArrayList var0 = new ArrayList(IiliIIliil.size());

         String var1;
         while ((var1 = IiliIIliil.poll()) != null) {
            var0.add(var1);
         }

         return var0;
      }
   }

   private Collection<String> IIIillIIil(class_746 p) {
      ArrayList var2 = new ArrayList(2);
      double var3 = 36.0;

      for (class_742 var6 : Iiiilllliiilll.field_1687.method_18456()) {
         if (var6 != p && !(var6.method_5858(p) > var3)) {
            var2.add(var6.method_7334().name());
         }
      }

      return var2;
   }
}

package gg.corz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.regex.Pattern;

public final class iiliIiiIIiiIii {
   final int[] liIllIiIIl;
   boolean llIllIiIIl;
   boolean IilllIiIIl;
   double iiiIlIiIIl;
   static final int[] iIiIlIiIIl = new int[]{
      0, 0, -(944894830 ^ -91) ^ 944894783, (-2107914922 * -45 ^ 11) * 95 * -1631000239 ^ -876131411, -1604822389 * 252645135 * -121 + -83 ^ 1462342458
   };
   final Map<String, IiIlililliIlilil> IiiIlIiIIl = new HashMap<>();
   boolean ilIllIiIIl;
   static final int IliIlIiIIl = 10;
   long illllIiIIl;
   double IIIllIiIIl;
   long IllllIiIIl;
   static final long lliIlIiIIl = 2000L;
   double liiIlIiIIl;
   boolean lIlllIiIIl;
   int IiIllIiIIl;
   List<String> IIlllIiIIl;
   int lilllIiIIl;
   int iIIllIiIIl;
   long lllllIiIIl;
   boolean IlIllIiIIl;
   List<String> iiIllIiIIl;
   int lIIllIiIIl;
   long iIlllIiIIl;
   public final long iliIlIiIIl;

   boolean IiIiliIiiiIi(lIilllliIillll c) {
      for (IiIlililliIlilil var3 : this.IiiIlIiIIl.values()) {
         if (var3.IiIiIlIlil == c) {
            return true;
         }
      }

      return false;
   }

   public int IlIlllIlilIl(lIiiIlliIiiIll s) {
      return this.liIllIiIIl[s.ordinal()];
   }

   public int lIiiIiIlilli() {
      return this.iIIllIiIIl;
   }

   double IIlilIliiIli(double px, double pz) {
      double var5 = this.liiIlIiIIl - px;
      double var7 = this.IIIllIiIIl - pz;
      return var5 * var5 + var7 * var7;
   }

   public List<String> IIlllIlliIll() {
      return this.IIlllIiIIl;
   }

   public void Iilllilliill() {
      this.IilllIiIIl = true;
   }

   public int IlIillIiilIi() {
      return this.IiiIlIiIIl.size();
   }

   public boolean Ililllililil(long settleMs, long now) {
      if (this.lllllIiIIl == (-2837823790228010564L ^ -2837823790228010564L) || settleMs - this.illllIiIIl > (7629003985726955356L ^ 7629003985726953612L)) {
         this.lllllIiIIl = settleMs;
      }

      this.illllIiIIl = settleMs;
      return settleMs - this.lllllIiIIl >= now;
   }

   public double iIlIlllllill() {
      return this.IIIllIiIIl;
   }

   public boolean Illlllllilll() {
      return this.IilllIiIIl;
   }

   public double IliIlllilIi() {
      return this.liiIlIiIIl;
   }

   public boolean IIillIiliIil(int minCore) {
      if (!this.ilIllIiIIl && !this.lIlllIiIIl && this.iIIllIiIIl >= minCore) {
         this.ilIllIiIIl = true;
         return true;
      } else {
         return false;
      }
   }

   public int iliIiiliiiii() {
      return this.lilllIiIIl;
   }

   void Illillliilli(long now) {
      this.IiiIlIiIIl.values().removeIf(nowx -> nowx.iIlIlllllill(now));
      EnumMap var3 = new EnumMap<>(lIilllliIillll.class);
      EnumMap var4 = new EnumMap<>(lIilllliIillll.class);
      HashMap var5 = new HashMap();
      IiIlililliIlilil var6 = null;
      IiIlililliIlilil var7 = null;
      double var8 = 0.0;
      double var10 = 0.0;
      double var12 = 0.0;
      double var14 = 0.0;

      for (IiIlililliIlilil var17 : this.IiiIlIiIIl.values()) {
         if (var17.IiIiIlIlil == lIilllliIillll.iiiiiiiilIIIIIIIIi) {
            if (var7 == null || var17.iIliIlIlil > var7.iIliIlIlil) {
               var7 = var17;
            }
         } else {
            if (var17.IiIiIlIlil.iIlIIIIIiIllIIIIIi) {
               if (var6 == null || var17.iIliIlIlil > var6.iIliIlIlil) {
                  var6 = var17;
               }
            } else {
               var3.merge(var17.IiIiIlIlil, Integer.valueOf(var17.iIliIlIlil), Integer::sum);
               if (var17.IlliIlIlil != null && var17.iIliIlIlil > var5.getOrDefault(var17.IiIiIlIlil, -1)) {
                  var5.put(var17.IiIiIlIlil, var17.iIliIlIlil);
                  var4.put(var17.IiIiIlIlil, var17.IlliIlIlil);
               }
            }

            double var18 = (double)Math.max(1, var17.iIliIlIlil);
            var8 += (double)var17.liIiIlIlil * var18;
            var10 += (double)var17.iiIiIlIlil * var18;
            var12 += (double)var17.IIliIlIlil * var18;
            var14 += var18;
         }
      }

      IiIlililliIlilil var30 = var6 != null ? var6 : var7;
      if (var30 != null) {
         this.liiIlIiIIl = (double)var30.liIiIlIlil;
         this.iiiIlIiIIl = (double)var30.iiIiIlIlil;
         this.IIIllIiIIl = (double)var30.IIliIlIlil;
      } else if (var14 > 0.0) {
         this.liiIlIiIIl = var8 / var14;
         this.iiiIlIiIIl = var10 / var14;
         this.IIIllIiIIl = var12 / var14;
      }

      int var31 = var6 == null ? 0 : Math.min(100, var6.iIliIlIlil);
      int var32 = var7 == null ? 0 : var7.iIliIlIlil;
      Arrays.fill(this.liIllIiIIl, 0);
      ArrayList var19 = new ArrayList();

      for (Entry var21 : var3.entrySet()) {
         lIilllliIillll var22 = (lIilllliIillll)var21.getKey();
         int var23 = Math.min(var22.ilIIIIIIiIiIIIIIIi, (Integer)var21.getValue());
         this.liIllIiIIl[var22.lIIIIIIIiiIIIIIIIi.ordinal()] += var23;
         var19.add(new int[]{var22.ordinal(), var23});
      }

      int var33 = 0;
      int var34 = 0;

      for (int var35 = 0; var35 < this.liIllIiIIl.length; var35++) {
         this.liIllIiIIl[var35] = Math.min(iIiIlIiIIl[var35], this.liIllIiIIl[var35]);
         var33 += this.liIllIiIIl[var35];
         if (this.liIllIiIIl[var35] > 0) {
            var34++;
         }
      }

      this.liIllIiIIl[lIiiIlliIiiIll.liIIllliliiIIlllil.ordinal()] = var31;
      int var36 = Math.max(var31, var32);
      this.iIIllIiIIl = var36;
      this.lIIllIiIIl = var36 > 0 ? Math.min(100, var36 + Math.min(10, var33)) : 0;
      this.lilllIiIIl = var32;
      this.IlIllIiIIl = var6 == null && var7 != null;
      this.llIllIiIIl = var6 != null && var6.IiIiIlIlil == lIilllliIillll.iIlliiiilIllliiiil;
      this.IiIllIiIIl = var34 + (var31 > 0 ? 1 : 0);
      var19.sort((b, a) -> Integer.compare(a[1], b[1]));
      ArrayList var37 = new ArrayList(4);
      ArrayList var24 = new ArrayList(3);
      String var25 = var6 != null ? (var6.IlliIlIlil != null && !var6.IlliIlIlil.isBlank() ? var6.IlliIlIlil : var6.IiIiIlIlil.IIlIIIIIilIlIIIIIi) : null;
      if (var25 != null) {
         var37.add(var25);
         var24.add(var25);
      } else if (var7 != null && var7.IlliIlIlil != null && !var7.IlliIlIlil.isBlank()) {
         for (String var29 : var7.IlliIlIlil.split(Pattern.quote(Iliilliiilii<"Iliilliiilii","NuE20u0mI9QhSxSKX45zU1HvmkYqdlWxDFvBKUs=">()))) {
            if (!var29.isBlank() && var37.size() < 2) {
               var37.add(var29);
               var24.add(var29);
            }
         }
      }

      if (var37.isEmpty() && var7 != null) {
         var37.add(lIilllliIillll.iiiiiiiilIIIIIIIIi.IIlIIIIIilIlIIIIIi);
      }

      for (int[] var39 : var19) {
         if (var37.size() >= 3 || var39[1] <= 0) {
            break;
         }

         lIilllliIillll var40 = lIilllliIillll.values()[var39[0]];
         if (var6 == null || var40.lIIIIIIIiiIIIIIIIi != var6.IiIiIlIlil.lIIIIIIIiiIIIIIIIi) {
            String var41 = (String)var4.get(var40);
            var37.add(var41 != null && !var41.isBlank() ? var41 : var40.IIlIIIIIilIlIIIIIi);
         }
      }

      this.iiIllIiIIl = List.copyOf(var37);
      this.IIlllIiIIl = List.copyOf(var24);
      this.lIlllIiIIl = false;
   }

   public Iterable<IiIlililliIlilil> IIIilIIiiIIi() {
      return this.IiiIlIiIIl.values();
   }

   public double liiiIIllIl() {
      return this.iiiIlIiIIl;
   }

   public int IilliliilIIi() {
      return this.lIIllIiIIl;
   }

   iiliIiiIIiiIii(long now, double z, double y, double x, long id) {
      this.liIllIiIIl = new int[lIiiIlliIiiIll.values().length];
      this.iiIllIiIIl = List.of();
      this.IIlllIiIIl = List.of();
      this.lIlllIiIIl = true;
      this.iliIlIiIIl = now;
      this.liiIlIiIIl = z;
      this.iiiIlIiIIl = y;
      this.IIIllIiIIl = x;
      this.iIlllIiIIl = id;
      this.IllllIiIIl = id;
   }

   public long Iiilliiliiil() {
      return this.iIlllIiIIl;
   }

   public List<String> IiIlliIliiIl() {
      return this.iiIllIiIIl;
   }

   public int IIIllIIliIIl() {
      return this.IiIllIiIIl;
   }
}

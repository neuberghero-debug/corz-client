package gg.corz;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import net.minecraft.class_2960;
import net.minecraft.class_332;
import net.minecraft.class_4587;
import net.minecraft.class_7833;

public final class iiilIiiIIIiIii implements iiiiIilIIIIlil {
   private static final float iIllIIiIIl = 10.0F;
   private float llIiIIiIIl;
   private final Map<String, Float> liilIIiIIl;
   private float iIIiIIiIIl;
   private static final int iiIlIIiIIl = 20;
   private static final float IlllIIiIIl = 6.0F;
   private static final float lIilIIiIIl = 4.0F;
   private static final float iIilIIiIIl = 0.04F;
   private float lIIiIIiIIl;
   private float IiIiIIiIIl;
   private static final float iillIIiIIl = 90.0F;
   private static final float IIilIIiIIl = 8.0F;
   private final Map<String, Boolean> llilIIiIIl;
   private static final float illlIIiIIl = 18.0F;
   private static final float llllIIiIIl = 26.0F;
   private float IIIiIIiIIl;
   private static final int lIllIIiIIl = -10000;
   private static final int IIllIIiIIl = 200;
   private final Map<String, liIliIliiIliIl> ililIIiIIl;
   private static final int llIlIIiIIl = 20;
   private float ilIiIIiIIl;
   private static final float lillIIiIIl = 0.82F;
   private static final float IillIIiIIl = 8.0F;
   private static final int IiIlIIiIIl = 32;
   private static final int ilIlIIiIIl = 24;
   private final Map<String, float[]> IiilIIiIIl;
   private final List<lllllillll> IlilIIiIIl;
   private IiiIllIlliiIllIl liIiIIiIIl;
   private static final int liIlIIiIIl = 44;
   private lllllillll iiIiIIiIIl;
   private final Map<String, Float> iiilIIiIIl;
   private float IlIiIIiIIl;

   private static void IIillIiliIil(lllllillll r, int w, int y, int x) {
      Object var4 = r.IiIIiilliIIiil;
      if (var4 instanceof iilIIIiIIiIIIi var5) {
         var5.IiIlliIliiIl(w, y, x, r.iiIIiilIIlIiil);
      } else if (var4 instanceof lIIiiIiiIIiiIi var6) {
         var6.IIIllIIliIIl(w, y, x, r.iiIIiilIIlIiil);
      } else if (var4 instanceof iilliilIIiliil var7) {
         var7.iliIiiliiiii(w, y, x, r.iiIIiilIIlIiil);
      } else if (var4 instanceof IillIIllillIIl var8) {
         var8.iliIiiliiiii(w, y, x, r.iiIIiilIIlIiil);
      } else if (var4 instanceof iiIlIIllIIllIIll var9) {
         var9.IiIlliIliiIl(w, y, x, r.iiIIiilIIlIiil);
      } else if (var4 instanceof illIIilIilIIil var10) {
         var10.IiIlliIliiIl(w, y, x, r.iiIIiilIIlIiil);
      } else if (var4 instanceof IiiIllIlliiIllIl var11) {
         var11.IIlllIlliIll(w, y, x, r.iiIIiilIIlIiil);
      }
   }

   private static void Ililllililil(class_332 my, lllllillll r, int mx, int ctx) {
      Object var4 = r.IiIIiilliIIiil;
      if (var4 instanceof iilIIIiIIiIIIi var5) {
         var5.IliIlllilIi(my, mx, ctx);
      } else if (var4 instanceof lIIiiIiiIIiiIi var6) {
         var6.liiiIIllIl(my, mx, ctx);
      } else if (var4 instanceof iilliilIIiliil var7) {
         var7.IliIlllilIi(my, mx, ctx);
      } else if (var4 instanceof IillIIllillIIl var8) {
         var8.IliIlllilIi(my, mx, ctx);
      } else if (var4 instanceof iiIlIIllIIllIIll var9) {
         var9.liiiIIllIl(my, mx, ctx);
      } else if (var4 instanceof illIIilIilIIil var10) {
         var10.liiiIIllIl(my, mx, ctx);
      } else if (var4 instanceof IiiIllIlliiIllIl var11) {
         var11.lIiiIiIlilli(my, mx, ctx);
      }
   }

   private static void IIlllIlliIll(class_2960 y, float degrees, float argb, float x, int icon) {
      class_4587 var5 = IIIiiIillIIiiIil.liiiIIllIl();
      float var6 = degrees + 4.0F;
      float var7 = argb + 4.0F;
      var5.method_22903();

      try {
         var5.method_46416(var6, var7, 0.0F);
         var5.method_22907(class_7833.field_40718.rotationDegrees(x));
         var5.method_46416(-var6, -var7, 0.0F);
         lIlIIIliIlIIIl.IIIilIIiiIIi(y, degrees, argb, 8.0F, icon);
      } finally {
         var5.method_22909();
      }
   }

   public void IilliliilIIi(class_332 ctx, iIIiliiIlIilii stage) {
      long var16 = 6680168117655468844L;
      long var18 = 4568931053456657024L;
      long var20 = 9076125762302419096L;
      long var14 = -6787838156974277117L;
      this.ilIiIIiIIl = stage.lIIIlliIIl + 10.0F;
      this.IiIiIIiIIl = stage.IlIIlliIIl - 20.0F;
      this.llIiIIiIIl = stage.iIIIlliIIl + 6.0F;
      this.IlIiIIiIIl = stage.llIIlliIIl - 12.0F;
      this.IIIiIIiIIl = lliiiIliliiiIl.IIIllIIliIIl(this.IIIiIIiIIl, this.lIIiIIiIIl, 18.0F, stage.illIlliIIl, 0.05F);
      this.iIIiIIiIIl = this.lIiiIiIlilli();
      this.Iilililiiili();
      var14 ^= ((long)Math.round(stage.ilIIlliIIl) << 32 ^ var14) & -1L << 32;
      var14 ^= ((long)Math.round(stage.liIIlliIIl) ^ var14) & -1L >>> 32;
      var16 ^= ((long)stage.iiIIlliIIl << 32 ^ var16) & -1L << 32;
      float var6 = this.llIiIIiIIl - llilliilililliil.IIIllIIliIIl(this.IIIiIIiIIl);
      this.iiilIIiIIl.clear();
      var16 ^= (0L ^ var16) & -1L >>> 32;

      for (long var27 = var18 ^ ((long)this.IlilIIiIIl.size() << 32 ^ var18) & -1L << 32;
         (int)var16 < (int)(var27 >>> 32);
         var16 ^= ((long)((int)var27) ^ var16) & -1L >>> 32
      ) {
         String var9 = this.IlilIIiIIl.get((int)var16).llIIiililIIiil;
         var27 ^= ((long)((int)var16) ^ var27) & -1L >>> 32;
         var20 ^= (0L ^ var20) & -1L << 32;

         while ((int)var27 < (int)(var27 >>> 32) && this.IlilIIiIIl.get((int)var27).llIIiililIIiil.equals(var9)) {
            int var10000 = (int)(var20 >>> 32);
            int var10002 = (int)var27;
            var27 ^= (var27 ^ var27 + (long)1) & -1L >>> 32;
            var20 ^= ((long)(var10000 + this.IlilIIiIIl.get(var10002).iiIIiilIIlIiil) << 32 ^ var20) & -1L << 32;
         }

         float var12 = this.liilIIiIIl.getOrDefault(var9, 0.0F);
         this.iiilIIiIIl.put(var9, var6);
         this.IlIlllIlilIl(
            ctx,
            var9,
            var6,
            var12,
            (int)(var16 >>> 32) != 0
               && (float)((int)var14) >= var6
               && (float)((int)var14) < var6 + 20.0F
               && (float)((int)(var14 >>> 32)) >= this.ilIiIIiIIl
               && (float)((int)(var14 >>> 32)) <= this.ilIiIIiIIl + this.IiIiIIiIIl,
            stage.illIlliIIl
         );
         var6 += 20.0F;
         var20 ^= ((long)Math.round((float)((int)(var20 >>> 32)) * var12) ^ var20) & -1L >>> 32;
         this.iliIiiliiiii(
            ctx,
            stage,
            (int)var16,
            (int)var27,
            var6,
            (int)var20,
            var12,
            (int)(var16 >>> 32) != 0 ? (int)(var14 >>> 32) : -10000,
            (int)(var16 >>> 32) != 0 ? (int)var14 : -10000
         );
         var6 += (float)((int)var20);
      }
   }

   public void IIlilIliiIli(double my, double mx, int button) {
      if (this.iiIiIIiIIl != null) {
         if (this.iiIiIIiIIl.IiIIiilliIIiil instanceof iilliilIIiliil var6) {
            var6.IilliliilIIi(my, mx, button);
         } else if (this.iiIiIIiIIl.IiIIiilliIIiil instanceof IillIIllillIIl var7) {
            var7.IilliliilIIi(my, mx, button);
         }

         this.iiIiIIiIIl = null;
      }
   }

   private void iliIiiliiiii(class_332 to, iIIiliiIlIilii top, int t, int shown, float mx, int my, float stage, int ctx, int from) {
      long var17 = -1167785027008284896L;
      long var19 = -6244898619862127486L;
      var17 ^= ((long)(stage >= 1.0F ? 1 : 0) << 32 ^ var17) & -1L << 32;
      float var11 = (int)(var17 >>> 32) != 0 ? mx : mx - (float)Math.round(8.0F * (1.0F - stage));

      for (var17 ^= ((long)t ^ var17) & -1L >>> 32; (int)var17 < shown; var17 ^= (var17 ^ var17 + (long)1) & -1L >>> 32) {
         lllllillll var13 = this.IlilIIiIIl.get((int)var17);
         var13.lIlIiiliIlIiil = var11;
         var13.IllIiillllIiil = (boolean)((int)(var17 >>> 32));
         var11 += (float)var13.iiIIiilIIlIiil;
      }

      if (my > 0) {
         if ((int)(var17 >>> 32) != 0) {
            for (long var26 = var17 ^ ((long)t ^ var17) & -1L >>> 32; (int)var26 < shown; var26 ^= (var26 ^ var26 + (long)1) & -1L >>> 32) {
               this.IIIllIIliIIl(to, this.IlilIIiIIl.get((int)var26), top.iIIIlliIIl, top.iIIIlliIIl + top.llIIlliIIl, ctx, from);
            }
         } else {
            lIlIIIliIlIIIl.Iliilliiilii(to, this.ilIiIIiIIl - 4.0F, mx, this.IiIiIIiIIl + 8.0F, (float)my);
            float var12 = IliiIilliiIi.IilliliilIIi(stage);

            try {
               float var23 = Math.max(top.iIIIlliIIl, mx);
               float var14 = Math.min(top.iIIIlliIIl + top.llIIlliIIl, mx + (float)my);

               for (long var27 = var19 ^ ((long)t << 32 ^ var19) & -1L << 32; (int)(var27 >>> 32) < shown; var27 += 4294967296L) {
                  this.IIIllIIliIIl(to, this.IlilIIiIIl.get((int)(var27 >>> 32)), var23, var14, -10000, -10000);
               }
            } finally {
               IliiIilliiIi.lIiiIiIlilli(var12);
               to.method_44380();
            }
         }
      }
   }

   public String Iiiiliiiiiii(int index) {
      long var8 = 8589343885673029085L;
      var8 ^= (0L ^ var8) & -1L << 32;

      for (Entry var4 : this.iiilIIiIIl.entrySet()) {
         int var10000 = (int)(var8 >>> 32);
         var8 += 4294967296L;
         if (var10000 == index) {
            float var5 = this.ilIiIIiIIl + this.IiIiIIiIIl / 2.0F;
            float var6 = (Float)var4.getValue() + 10.0F;
            var8 ^= ((long)this.Iiilliiliiil((double)var5, (double)var6, 0) ^ var8) & -1L >>> 32;
            return (String)var4.getKey()
               + llIIlilIIl<"llIIlilIIl","xKra4g49msBRB1lUxWjYxb4pH2+aGmx4Z7tBBkUr/C8=">()
               + Math.round(var5)
               + llIIlilIIl<"llIIlilIIl","SZiRBq1RU2yFetz1+9hSgwqXvMn803M5dCB0o+M=">()
               + Math.round(var6)
               + llIIlilIIl<"llIIlilIIl","+zXp6YXkNnq1eSRWxFdxr47pUkTI34UbHK/hqq3QXcs1">()
               + (int)var8
               + llIIlilIIl<"llIIlilIIl","DoYoqYfChFMg/GKoY8w8rqb4AO0JHeSsxXhTAPmoNSx8GA==">()
               + this.llilIIiIIl.get(var4.getKey());
         }
      }

      return llIIlilIIl<"llIIlilIIl","2VwZqOoeRPPKIR9Dmg3JRvcfZIeCyROh01GzTy/C/YO+mXFczF8A">()
         + index
         + llIIlilIIl<"llIIlilIIl","2AIx9NKwpNBF8GyST4Qq60xa2kr4jHv8EXiogQlvZKQ=">()
         + this.iiilIIiIIl.size();
   }

   public iiilIiiIIIiIii(Map<String, List<IilliIllilliIl>> groups) {
      long var8 = 3603384291533210266L;
      super();
      this.IlilIIiIIl = new ArrayList<>();
      this.llilIIiIIl = new LinkedHashMap<>();
      this.ililIIiIIl = new HashMap<>();
      this.IiilIIiIIl = new HashMap<>();
      this.liilIIiIIl = new HashMap<>();
      this.iiilIIiIIl = new LinkedHashMap<>();
      var8 ^= (4294967296L ^ var8) & -1L << 32;

      for (Entry var4 : groups.entrySet()) {
         this.llilIIiIIl.put((String)var4.getKey(), Boolean.valueOf((boolean)((int)(var8 >>> 32))));
         this.ililIIiIIl.put((String)var4.getKey(), new liIliIliiIliIl(llIIIliilIIIli.iiillliiiIIIilliii, 200, (int)(var8 >>> 32) != 0 ? 1.0 : 0.0));
         var8 ^= (0L ^ var8) & -1L << 32;

         for (IilliIllilliIl var6 : (List)var4.getValue()) {
            lllllillll var7 = this.iIlIlllllill((String)var4.getKey(), var6);
            if (var7 != null) {
               this.IlilIIiIIl.add(var7);
            }
         }
      }
   }

   private void Iilililiiili() {
      float var1 = Math.max(0.0F, this.iIIiIIiIIl - this.IlIiIIiIIl);
      if (this.lIIiIIiIIl > var1) {
         this.lIIiIIiIIl = var1;
      }

      if (this.lIIiIIiIIl < 0.0F) {
         this.lIIiIIiIIl = 0.0F;
      }

      if (this.IIIiIIiIIl > var1) {
         this.IIIiIIiIIl = var1;
      }
   }

   private void IlIillIiilIi(Object keep) {
      for (lllllillll var3 : this.IlilIIiIIl) {
         Object var5 = var3.IiIIiilliIIiil;
         if (var5 instanceof illIIilIilIIil) {
            illIIilIilIIil var4 = (illIIilIilIIil)var5;
            if (var4 != keep && var4.IIIllIIliIIl()) {
               var4.IlIlllIlilIl(false);
            }
         }
      }
   }

   public boolean Iiilliiliiil(double my, double button, int mx) {
      if (this.liIiIIiIIl != null) {
         IiiIllIlliiIllIl var10 = this.liIiIIiIIl;
         this.liIiIIiIIl = null;
         var10.IlIlllIlilIl(mx);
         return true;
      } else if (!(my < (double)(this.ilIiIIiIIl - 4.0F))
         && !(my > (double)(this.ilIiIIiIIl + this.IiIiIIiIIl + 4.0F))
         && !(button < (double)this.llIiIIiIIl)
         && !(button > (double)(this.llIiIIiIIl + this.IlIiIIiIIl))) {
         for (Entry var7 : this.iiilIIiIIl.entrySet()) {
            float var8 = (Float)var7.getValue();
            if (button >= (double)var8 && button < (double)(var8 + 20.0F)) {
               if (mx == 0) {
                  this.Iilllilliill((String)var7.getKey());
               }

               this.IlIillIiilIi(null);
               return true;
            }
         }

         for (lllllillll var11 : this.IlilIIiIIl) {
            if (var11.IllIiillllIiil && !(button < (double)var11.lIlIiiliIlIiil) && !(button >= (double)(var11.lIlIiiliIlIiil + (float)var11.iiIIiilIIlIiil))) {
               this.IlIillIiilIi(var11.IiIIiilliIIiil);
               if (!IIIilIIiiIIi(var11, my, button, mx)) {
                  return false;
               }

               if (var11.IiIIiilliIIiil instanceof iilliilIIiliil || var11.IiIIiilliIIiil instanceof IillIIllillIIl) {
                  this.iiIiIIiIIl = var11;
               }

               return true;
            }
         }

         this.IlIillIiilIi(null);
         return false;
      } else {
         return false;
      }
   }

   private float lIiiIiIlilli() {
      long var8 = -4506034735011835387L;
      long var10 = -7220239664016695715L;
      float var1 = 0.0F;
      this.liilIIiIIl.clear();
      var8 ^= (0L ^ var8) & -1L << 32;

      for (long var13 = var8 ^ ((long)this.IlilIIiIIl.size() ^ var8) & -1L >>> 32;
         (int)(var13 >>> 32) < (int)var13;
         var13 ^= ((long)((int)(var10 >>> 32)) << 32 ^ var13) & -1L << 32
      ) {
         String var4 = this.IlilIIiIIl.get((int)(var13 >>> 32)).llIIiililIIiil;
         var10 ^= ((long)((int)(var13 >>> 32)) << 32 ^ var10) & -1L << 32;
         var10 ^= (0L ^ var10) & -1L >>> 32;

         while ((int)(var10 >>> 32) < (int)var13 && this.IlilIIiIIl.get((int)(var10 >>> 32)).llIIiililIIiil.equals(var4)) {
            int var10000 = (int)var10;
            int var10002 = (int)(var10 >>> 32);
            var10 += 4294967296L;
            var10 ^= ((long)(var10000 + this.IlilIIiIIl.get(var10002).iiIIiilIIlIiil) ^ var10) & -1L >>> 32;
         }

         float var7 = this.Illlllllilll(var4);
         this.liilIIiIIl.put(var4, var7);
         var1 += (float)(20 + Math.round((float)((int)var10) * var7));
      }

      return var1;
   }

   private void IlIlllIlilIl(class_332 hot, String y, float ctx, float dt, boolean label, float t) {
      float[] var7 = this.IiilIIiIIl.computeIfAbsent(y, k -> new float[1]);
      var7[0] = lliiiIliliiiIl.IIIllIIliIIl(var7[0], label ? 1.0F : 0.0F, label ? 16.0F : 11.0F, t, 0.002F);
      float var8 = var7[0];
      float var9 = IIIiiIillIIiiIil.Illlllllilll();
      if (var8 > 0.002F) {
         IIIiiIillIIiiIil.IlIlllIlilIl(
            hot, this.ilIiIIiIIl - 4.0F, ctx + 1.0F, this.IiIiIIiIIl + 8.0F, 18.0F, 5.0F, llilliilililliil.IIIIllIIIl(-1, 0.04F * var8)
         );
      }

      float var10 = this.ilIiIIiIIl + 1.0F;
      IiIlliIliiIl(var10, llilliilililliil.IIIllIIliIIl(ctx + 10.0F - 4.0F), dt, IilIIIIililIIIIi.Illlllllilll(-7630437, -920587, (double)dt));
      lIlIIIliIlIIIl.Illlllllilll(y, var10 + 8.0F + 6.0F, ctx, 20.0F, 0.82F, IilIIIIililIIIIi.Illlllllilll(-7630437, -920587, (double)Math.max(var8, dt)));
      IIIiiIillIIiiIil.IilliliilIIi(
         hot, this.ilIiIIiIIl, llilliilililliil.IIIllIIliIIl(ctx + 20.0F - var9), this.IiIiIIiIIl, var9, IilIIIIililIIIIi.IIillIiliIil()
      );
   }

   private static void IiIlliIliiIl(float t, float x, float ink, int y) {
      if (!(ink <= 0.0F) && !(ink >= 1.0F)) {
         IIlllIlliIll(lIlIIiliIlIIil.IliIlllilIi(), t, x, 90.0F * ink, llilliilililliil.IIIIllIIIl(y, lliiiIliliiiIl.IliIlllilIi(2.0F - 2.0F * ink)));
         IIlllIlliIll(lIlIIiliIlIIil.IIlilIliiIli(), t, x, 90.0F * (ink - 1.0F), llilliilililliil.IIIIllIIIl(y, lliiiIliliiiIl.IliIlllilIi(2.0F * ink)));
      } else {
         lIlIIIliIlIIIl.IIIilIIiiIIi(ink >= 1.0F ? lIlIIiliIlIIil.IIlilIliiIli() : lIlIIiliIlIIil.IliIlllilIi(), t, x, 8.0F, y);
      }
   }

   private lllllillll iIlIlllllill(String s, IilliIllilliIl group) {
      if (group instanceof iiIiiilIIliiil var9) {
         return new lllllillll(s, new iilIIIiIIiIIIi(var9, 0, 0, 0, 20), 20);
      } else if (group instanceof ililliIiIiilliIi var8) {
         return new lllllillll(s, new lIIiiIiiIIiiIi(var8, 0, 0, 0, 24), 24);
      } else if (group instanceof iilliIlIIiliIl var7) {
         return new lllllillll(s, new iilliilIIiliil(var7, 0, 0, 0, 32), 32);
      } else if (group instanceof IIIIlilllIIIlill var6) {
         return new lllllillll(s, new IillIIllillIIl(var6, 0, 0, 0, 32), 32);
      } else if (group instanceof lliliIIiililiIIi var5) {
         return new lllllillll(s, new iiIlIIllIIllIIll(var5, 0, 0, 0, 24), 24);
      } else if (group instanceof IIiiIIIllIiiIIIl var4) {
         return new lllllillll(s, new illIIilIilIIil(var4, 0, 0, 0, 44), 44);
      } else {
         return group instanceof illlIlIlIillIlIl var3 ? new lllllillll(s, new IiiIllIlliiIllIl(var3, 0, 0, 0, 24, this), 24) : null;
      }
   }

   public boolean IIiilIiiiIii(int key, int modifiers) {
      if (this.liIiIIiIIl != null) {
         IiiIllIlliiIllIl var7 = this.liIiIIiIIl;
         this.liIiIIiIIl = null;
         var7.IIIllIIliIIl(key);
         return true;
      } else {
         for (lllllillll var4 : this.IlilIIiIIl) {
            if (var4.IiIIiilliIIiil instanceof illIIilIilIIil var5 && var5.IIIllIIliIIl()) {
               return var5.IilliliilIIi(key, 0, modifiers);
            }
         }

         return false;
      }
   }

   public boolean Iliilliiilii(int codepoint, int modifiers) {
      for (lllllillll var4 : this.IlilIIiIIl) {
         if (var4.IiIIiilliIIiil instanceof illIIilIilIIil var5 && var5.IIIllIIliIIl()) {
            return var5.lIiiIiIlilli((char)codepoint, modifiers);
         }
      }

      return false;
   }

   @Override
   public void IliIlllilIi(IiiIllIlliiIllIl component) {
      this.liIiIIiIIl = component;
   }

   public void Illillliilli(double amount) {
      this.lIIiIIiIIl -= (float)amount * 26.0F;
      this.Iilililiiili();
   }

   private static boolean IIIilIIiiIIi(lllllillll b, double r, double mx, int my) {
      Object var6 = b.IiIIiilliIIiil;
      if (var6 instanceof iilIIIiIIiIIIi var13) {
         return var13.iliIiiliiiii(r, mx, my);
      } else if (var6 instanceof lIIiiIiiIIiiIi var12) {
         return var12.lIiiIiIlilli(r, mx, my);
      } else if (var6 instanceof iilliilIIiliil var11) {
         return var11.liiiIIllIl(r, mx, my);
      } else if (var6 instanceof IillIIllillIIl var10) {
         return var10.liiiIIllIl(r, mx, my);
      } else if (var6 instanceof iiIlIIllIIllIIll var9) {
         return var9.iliIiiliiiii(r, mx, my);
      } else if (var6 instanceof illIIilIilIIil var8) {
         return var8.iIlIlllllill(r, mx, my);
      } else {
         return var6 instanceof IiiIllIlliiIllIl var7 ? var7.iliIiiliiiii(r, mx, my) : false;
      }
   }

   private float Illlllllilll(String group) {
      liIliIliiIliIl var2 = this.ililIIiIIl.get(group);
      if (var2 == null) {
         return this.llilIIiIIl.getOrDefault(group, false) ? 1.0F : 0.0F;
      } else {
         return lliiiIliliiiIl.IliIlllilIi((float)var2.iIlIlllllill());
      }
   }

   private void Iilllilliill(String group) {
      long var6 = 5901596462216828293L;
      var6 ^= ((long)(!this.llilIIiIIl.getOrDefault(group, false) ? 1 : 0) << 32 ^ var6) & -1L << 32;
      this.llilIIiIIl.put(group, Boolean.valueOf((boolean)((int)(var6 >>> 32))));
      liIliIliiIliIl var3 = this.ililIIiIIl.get(group);
      if (var3 != null) {
         var3.lIiiIiIlilli((int)(var6 >>> 32) != 0 ? 1.0 : 0.0);
      }

      for (lllllillll var5 : this.IlilIIiIIl) {
         if (var5.llIIiililIIiil.equals(group)) {
            var5.IllIiillllIiil = false;
         }
      }
   }

   public void IIIIllIIIl() {
      this.liIiIIiIIl = null;
      this.iiIiIIiIIl = null;
      this.IlIillIiilIi(null);
   }

   @Override
   public boolean liiiIIllIl(IiiIllIlliiIllIl component) {
      return this.liIiIIiIIl == component;
   }

   public void IiIiliIiiiIi(double button, double my, int mx) {
      if (this.iiIiIIiIIl != null) {
         if (this.iiIiIIiIIl.IiIIiilliIIiil instanceof iilliilIIiliil var6) {
            var6.iIlIlllllill(button, my, mx);
         } else if (this.iiIiIIiIIl.IiIIiilliIIiil instanceof IillIIllillIIl var7) {
            var7.iIlIlllllill(button, my, mx);
         }
      }
   }

   private void IIIllIIliIIl(class_332 mx, lllllillll my, float hi, float lo, int ctx, int r) {
      IIillIiliIil(my, (int)this.ilIiIIiIIl, Math.round(my.lIlIiiliIlIiil), (int)this.IiIiIIiIIl);
      if (my.lIlIiiliIlIiil + (float)my.iiIIiilIIlIiil >= hi && my.lIlIiiliIlIiil <= lo) {
         Ililllililil(mx, my, ctx, r);
      }
   }
}

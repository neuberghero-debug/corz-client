package gg.corz;

import java.util.List;
import net.minecraft.class_243;
import net.minecraft.class_310;

public class liIlliiiIlli extends ilIllIiIll {
   private final lliliIIiililiIIi IIIiiiIIllIIiiiIIl;
   private static final String[] liiliiIIliiiliiIIl = new String[]{
      IliIlllilIi<"IliIlllilIi","KYa+2zBlW15pWk9vM8VL/TfusyGUIoQWj1vp0HdRvE6+">(),
      IliIlllilIi<"IliIlllilIi","/nx8ZsQGO7xD3x05K+U5x61tSQjxmtM28WnBBwsDdg==">(),
      IliIlllilIi<"IliIlllilIi","4iYruykq/5pQNN2ptig7V6sieAwYke9pI3v9CheRb0Z/id3RTv7L">(),
      IliIlllilIi<"IliIlllilIi","tdoCoaByVcmHglKp1xCBL7Jv5Z45uTK7g0dd4VEVP0I=">(),
      IliIlllilIi<"IliIlllilIi","ivpMZVDg5RbPPrQ5P3bsKolxARZAqZEewTkBZnjdTtxnqdTKCPY=">(),
      IliIlllilIi<"IliIlllilIi","YLouyCxIh3jaJAY3StU3xQcl+Q3cTU9Qsh3P01aSAu4=">(),
      IliIlllilIi<"IliIlllilIi","uZnJAf3ckRCDUNH/jwRaZphPPURf30J3cJsLDCY=">(),
      IliIlllilIi<"IliIlllilIi","yOjrUh56xR8nzpFNzSuPk1dZ0vbXGL0WN0x92/8=">(),
      IliIlllilIi<"IliIlllilIi","BuihUGjj5X6znmpXuSxoWsHKCk3hjvwVxQSpI4aEW5UE7ZNt">(),
      IliIlllilIi<"IliIlllilIi","y0RcybabmXmkLBNZU9sDSh6nr8jHWSlFmVkenJqZ7aI=">(),
      IliIlllilIi<"IliIlllilIi","waRK2NvT3hnyi/Rto/GR/yY0tl+2kPLQHHBUpObi3Q==">(),
      IliIlllilIi<"IliIlllilIi","H4140k3x5AZJNX5nMiQNCFXSDrf3n+/lVpfbuzXxtarDQgg=">(),
      IliIlllilIi<"IliIlllilIi","DzL/25qW8yUMF0jH9XlyJnun7Jokj3ON2J0VD0w4JQ==">(),
      IliIlllilIi<"IliIlllilIi","+6oi6YzaglYwpyRJKJE8eyujpKIEyOWaUJXYWliAP4vG">(),
      IliIlllilIi<"IliIlllilIi","V6zgt5brXgj5vGiEjgm09ad53OPeliLfbvo1IM0o9OSXtsM=">()
   };
   private final iiIiiilIIliiil liliiiIIliiliiiIIl;
   private final iiIiiilIIliiil lIliiiIIliIliiiIIl;
   private final iiIiiilIIliiil illiiiIIlIiliiiIIl;
   private final iilliIlIIiliIl llIiiiIIlilIiiiIIl;
   private final iliiliilIiiiliil iiIiiiIIlIIliiiIIl;
   private final iilliIlIIiliIl IiIiiiIIlliIiiiIIl;
   private final iilliIlIIiliIl iIIiiiIIlIlIiiiIIl;
   private float iIiiiiIIlIliiiiIIl;
   private final ililliIiIiilliIi IIiiiiIIllIiiiiIIl;
   private final iiIiiilIIliiil IlliiiIIlllliiiIIl;
   private long lliiiiIIliliiiiIIl;

   @Override
   public void Iliilliiilii(lIiIlliiIiIlli event) {
      if (Iiiilllliiilll.field_1724 != null) {
         if (Iiiilllliiilll.field_1755 == null) {
            if (!Iiiilllliiilll.field_1690.field_1842) {
               if (Iiiilllliiilll.field_1690.method_31044().method_31034() || lilIliIiiilIliIi.lIIlliIIll()) {
                  if (!Iiiilllliiilll.method_53526().method_53536()) {
                     float var2 = (float)Iiiilllliiilll.method_22683().method_4486() / 2.0F;
                     float var3 = (float)Iiiilllliiilll.method_22683().method_4502() / 2.0F;
                     this.lIIlliIIll(var2, var3, 1.0F, this.Illillllil());
                  }
               }
            }
         }
      }
   }

   public iilliIlIIiliIl iilllIIill() {
      return this.iIIiiiIIlIlIiiiIIl;
   }

   public void IlIllllIll(String cx, float spreadPx, float styleName, float cy, float scale) {
      iiiIiIlIIIliIl var6 = new iiiIiIlIIIliIl(
         spreadPx,
         styleName,
         this.iiIiiiIIlIIliiiIIl.Iilllilliill(),
         this.lIliiiIIliIliiiIIl.Iilllilliill(),
         this.illiiiIIlIiliiiIIl.Iilllilliill(),
         this.IlliiiIIlllliiiIIl.Iilllilliill(),
         false
      );
      this.llIililIil(var6, cx, cy, scale);
      var6.Iilllilliill();
   }

   private void llIililIil(iiiIiIlIIIliIl r, String styleName, float s, float spread) {
      float var5 = (float)this.iIIiiiIIlIlIiiiIIl.Iilllilliill() * s;
      float var6 = (float)this.llIiiiIIlilIiiiIIl.Iilllilliill() * s + spread;
      float var7 = (float)this.IiIiiiIIlliIiiiIIl.Iilllilliill() * s;
      float var8 = Math.max(1.0F, var7 * 0.5F);
      float var9 = Math.max(1.0F, var7 * 0.6F);
      boolean var10 = this.IlliiiIIlllliiiIIl.Iilllilliill();
      String var11 = styleName == null ? "" : styleName;
      switch (var11) {
         case IliIlllilIi<"IliIlllilIi","/nx8ZsQGO7xD3x05K+U5x61tSQjxmtM28WnBBwsDdg==">():
            r.lIiiIiIlilli(Math.max(1.0F, var7 * 0.8F));
            break;
         case IliIlllilIi<"IliIlllilIi","4iYruykq/5pQNN2ptig7V6sieAwYke9pI3v9CheRb0Z/id3RTv7L">():
            IiIilliIil(r, var6, var5, var7);
            r.lIiiIiIlilli(Math.max(1.0F, var7 * 0.7F));
            break;
         case IliIlllilIi<"IliIlllilIi","tdoCoaByVcmHglKp1xCBL7Jv5Z45uTK7g0dd4VEVP0I=">():
            r.iliIiiliiiii(var6 + var5 * 0.7F, var8);
            break;
         case IliIlllilIi<"IliIlllilIi","ivpMZVDg5RbPPrQ5P3bsKolxARZAqZEewTkBZnjdTtxnqdTKCPY=">():
            r.iliIiiliiiii(var6 + var5 * 0.7F, var8);
            r.lIiiIiIlilli(var9);
            break;
         case IliIlllilIi<"IliIlllilIi","YLouyCxIh3jaJAY3StU3xQcl+Q3cTU9Qsh3P01aSAu4=">():
            float var21 = var6 + var5 * 0.6F;
            r.iliIiiliiiii(var21, var8);
            float var25 = var21 + Math.max(1.0F, var7 * 0.75F);

            for (int var26 = 0; var26 < 4; var26++) {
               r.iIlIlllllill((float)var26 * 90.0F, var25, var25 + var5 * 0.6F, var7);
            }
            break;
         case IliIlllilIi<"IliIlllilIi","uZnJAf3ckRCDUNH/jwRaZphPPURf30J3cJsLDCY=">():
            for (int var20 = 0; var20 < 4; var20++) {
               r.iIlIlllllill(45.0F + (float)var20 * 90.0F, var6, var6 + var5, var7);
            }
            break;
         case IliIlllilIi<"IliIlllilIi","yOjrUh56xR8nzpFNzSuPk1dZ0vbXGL0WN0x92/8=">():
            r.iIlIlllllill(0.0F, var6, var6 + var5, var7);
            r.iIlIlllllill(90.0F, var6, var6 + var5, var7);
            r.iIlIlllllill(180.0F, var6, var6 + var5, var7);
            break;
         case IliIlllilIi<"IliIlllilIi","BuihUGjj5X6znmpXuSxoWsHKCk3hjvwVxQSpI4aEW5UE7ZNt">():
            iiIilIIlil(r, var6 + var5, Math.max(var7, var5 * 0.7F), var7);
            r.lIiiIiIlilli(var9);
            break;
         case IliIlllilIi<"IliIlllilIi","y0RcybabmXmkLBNZU9sDSh6nr8jHWSlFmVkenJqZ7aI=">():
            float var19 = var6 + var5 * 0.7F;

            for (int var24 = 0; var24 < 4; var24++) {
               r.IIIllIIliIIl(var19, var8, 45.0F + (float)var24 * 90.0F, 50.0F);
            }

            r.lIiiIiIlilli(var9);
            break;
         case IliIlllilIi<"IliIlllilIi","waRK2NvT3hnyi/Rto/GR/yY0tl+2kPLQHHBUpObi3Q==">():
            float var18 = var6 + var5 * 0.6F;
            float var23 = Math.max(1.5F, var5 * 0.4F);
            r.IiIlliIliiIl(-90.0F, var18, var23);
            r.IiIlliIliiIl(30.0F, var18, var23);
            r.IiIlliIliiIl(150.0F, var18, var23);
            break;
         case IliIlllilIi<"IliIlllilIi","H4140k3x5AZJNX5nMiQNCFXSDrf3n+/lVpfbuzXxtarDQgg=">():
            r.IlIlllIlilIl(var6 + var5 * 0.55F, var8, 45.0F, var10 ? var8 : 0.0F);
            r.lIiiIiIlilli(var9);
            break;
         case IliIlllilIi<"IliIlllilIi","DzL/25qW8yUMF0jH9XlyJnun7Jokj3ON2J0VD0w4JQ==">():
            r.IlIlllIlilIl(var6 + var5 * 0.5F, var8, 0.0F, var10 ? var8 * 1.5F : 0.0F);
            r.lIiiIiIlilli(var9);
            break;
         case IliIlllilIi<"IliIlllilIi","+6oi6YzaglYwpyRJKJE8eyujpKIEyOWaUJXYWliAP4vG">():
            float var17 = var6 + var5 * 0.8F;
            r.iliIiiliiiii(var17, Math.max(1.0F, var7 * 0.4F));
            float var22 = var17 + Math.max(1.0F, var7 * 0.5F);
            float var15 = Math.max(0.5F, var7 * 0.35F);

            for (int var16 = 0; var16 < 4; var16++) {
               r.iIlIlllllill((float)var16 * 90.0F, var22, var22 + var5 * 1.4F, var15);
            }

            r.lIiiIiIlilli(Math.max(1.0F, var7 * 0.5F));
            break;
         case IliIlllilIi<"IliIlllilIi","V6zgt5brXgj5vGiEjgm09ad53OPeliLfbvo1IM0o9OSXtsM=">():
            float var13 = var6 + var7 * 0.5F;
            float var14 = var5 * 0.9F;
            r.IilliliilIIi(0.0F, var13, -var14, var13 + var14, var7);
            r.IilliliilIIi(0.0F, var13, var14, var13 + var14, var7);
            break;
         default:
            IiIilliIil(r, var6, var5, var7);
      }
   }

   public iiIiiilIIliiil liilliiill() {
      return this.IlliiiIIlllliiiIIl;
   }

   private float Illillllil() {
      long var1 = System.nanoTime();
      float var3 = this.lliiiiIIliliiiiIIl == 0L ? 0.016F : Math.min(0.1F, (float)(var1 - this.lliiiiIIliliiiiIIl) / 1.0E9F);
      this.lliiiiIIliliiiiIIl = var1;
      if (!this.liliiiIIliiliiiIIl.Iilllilliill()) {
         this.iIiiiiIIlIliiiiIIl = 0.0F;
         return 0.0F;
      } else {
         class_243 var4 = Iiiilllliiilll.field_1724.method_18798();
         double var5 = Math.hypot(var4.field_1352, var4.field_1350);
         float var7 = var5 > 0.03 ? (float)Math.min(1.0, var5 / 0.26) : 0.0F;
         if (!Iiiilllliiilll.field_1724.method_24828()) {
            var7 = Math.max(var7, 0.7F);
         }

         this.iIiiiiIIlIliiiiIIl = this.iIiiiiIIlIliiiiIIl + (var7 - this.iIiiiiIIlIliiiiIIl) * (1.0F - (float)Math.exp((double)(-var3 * 14.0F)));
         if (Math.abs(this.iIiiiiIIlIliiiiIIl) < 0.002F) {
            this.iIiiiiIIlIliiiiIIl = 0.0F;
         }

         return this.IIllllIlll(this.iIiiiiIIlIliiiiIIl);
      }
   }

   public iiIiiilIIliiil IIIillIIil() {
      return this.illiiiIIlIiliiiIIl;
   }

   public List<String> iIlllIllll() {
      return this.IIIiiiIIllIIiiiIIl.IiIiliIiiiIi();
   }

   public void lIIlliIIll(float scale, float cx, float spreadPx, float cy) {
      this.IlIllllIll(this.IIIiiiIIllIIiiiIIl.Iilllilliill(), scale, cx, spreadPx, cy);
   }

   public iiIiiilIIliiil iIIilIlIil() {
      return this.liliiiIIliiliiiIIl;
   }

   public static boolean lIliliIlil() {
      liIlliiiIlli var0 = (liIlliiiIlli)llilIllililIll.iliIiiliiiii(liIlliiiIlli.class);
      return var0 != null && var0.IliIlllilIi();
   }

   public iilliIlIIiliIl Ilillllill() {
      return this.IiIiiiIIlliIiiiIIl;
   }

   public float IIllllIlll(float amount) {
      return amount * (2.0F + (float)this.iIIiiiIIlIlIiiiIIl.Iilllilliill() * 0.5F);
   }

   public iilliIlIIiliIl lIilliIill() {
      return this.llIiiiIIlilIiiiIIl;
   }

   public liIlliiiIlli() {
      super(IliIlllilIi<"IliIlllilIi","Dd5hkENIJUnhv3gXA86QDoXHXJhooalHvb7gozDd3Pa8EABnSPXjA32Oulc=">(), lllIllillIll.IiIlIIIiliIlIIIi);
      this.IIIiiiIIllIIiiiIIl = new lliliIIiililiIIi(
         IliIlllilIi<"IliIlllilIi","lRUCVb7byhm8Wckaws8pH/x7jR/fLsExX+q5gmuR203F">(),
         IliIlllilIi<"IliIlllilIi","NyBYraT34x54w9FkqQM/gdxkq6ihtXYniioBSAu6xxll1ZBiBdjcWbTMxw==">(),
         IliIlllilIi<"IliIlllilIi","KYa+2zBlW15pWk9vM8VL/TfusyGUIoQWj1vp0HdRvE6+">(),
         liiliiIIliiiliiIIl
      );
      this.iIIiiiIIlIlIiiiIIl = new iilliIlIIiliIl(
         IliIlllilIi<"IliIlllilIi","zjPMAiN15byX0WHT8ZIBLJGFNM31gzlWldmciwLSRH0=">(),
         IliIlllilIi<"IliIlllilIi","cFnzDkfi3jw4vr5DZjXooOPYO9Sx3P0oYjj45SqZa0G4AbJ0it2Bdk6hSdUX4VDP2+DQDS8avkdu1FjWa7oqKmephwtb">(),
         5,
         1,
         20
      );
      this.llIiiiIIlilIiiiIIl = new iilliIlIIiliIl(
         IliIlllilIi<"IliIlllilIi","fBN/XIvO44Fm5G8Ic5+07QJwS+ZX6w6/1gWUZmiBfg==">(),
         IliIlllilIi<"IliIlllilIi","pdWBuFeovlZcOAe3HglGUW1k0pedQz2tTvQ48HVvwELjtUNpvK8tpzeFjM++lv0=">(),
         2,
         0,
         10
      );
      this.IiIiiiIIlliIiiiIIl = new iilliIlIIiliIl(
         IliIlllilIi<"IliIlllilIi","GVKTmE60NeNJiR8eVXlUD/rQiDPUxnJDXjZjqP3AMuI/iJbw5w==">(),
         IliIlllilIi<"IliIlllilIi","AyIbxilF2m/4F0O/DiL4zez9reK+gx/7KRclDu9rBJ/PNl18muq21V5q">(),
         2,
         1,
         6
      );
      this.iiIiiiIIlIIliiiIIl = new iliiliilIiiiliil(
         IliIlllilIi<"IliIlllilIi","JkTjReNKptNX10r+6mMA/TprrouHlMvz0u8G0DU6WxVx">(),
         IliIlllilIi<"IliIlllilIi","cVaReNEmtKYFZxmuJ26rDEQ4OkAhOTiTuRn8Q9g8lyXw7NmxnTNPivA5Vqg=">(),
         -1
      );
      this.lIliiiIIliIliiiIIl = new iiIiiilIIliiil(
         IliIlllilIi<"IliIlllilIi","d6jTl6+emC6INV34czScG1dT2kx9dVmMAloGjBGpPJPz69Q=">(),
         IliIlllilIi<"IliIlllilIi","qsq8zGsc3f0w7orZRocv/MkfsIe6MHadB0lTS6xzu91c3tIgPg+4cTscS1UKLNFfBdmJP6SB/Mbcw8s9hVx2ypUlpjWDoriPo75FrgkChKp3Ne/oyglddvQl3p/23jOlo0BOdsfZe0GgHstnPh2tAYRb">(),
         true
      );
      this.IlliiiIIlllliiiIIl = new iiIiiilIIliiil(
         IliIlllilIi<"IliIlllilIi","VhtuQCDtYzOjnEtkLj9KA+g/RMBFDd0O8GYet4GS2v2P7CI=">(),
         IliIlllilIi<"IliIlllilIi","L6/n4sBe4p69JN7TwIrXL6IfCAgj2TlPJEaILFpb2G3VqUz5U/aGxUt+SFfGgD0BBrqStjnvlDKQf9wf2H9iRQuD5lQEy90hizBJYmpvhNE=">(),
         false
      );
      this.illiiiIIlIiliiiIIl = new iiIiiilIIliiil(
         IliIlllilIi<"IliIlllilIi","wGktaMBdIu21MuPcl+iwvIldKC0S712pX9aA78kqs+A=">(),
         IliIlllilIi<"IliIlllilIi","1zDgBjcX12k8JB4fCoCvzEUuKrmN2y27Unqii/aGtrxw9yHA1BrEjtYbLzuj59b5QtFwgYDsJFo2njE=">(),
         false
      );
      this.liliiiIIliiliiiIIl = new iiIiiilIIliiil(
         IliIlllilIi<"IliIlllilIi","jRfWu9cUiI+YNc0XZQYXBC45zsM1SN/Vqh3WRVlxWVIODsk=">(),
         IliIlllilIi<"IliIlllilIi","obe/HhNKW4x3QpqS6pgpqrVxmaMh6uZKHxnSwogpsuSliWpGiUMZ/YA9yyu0Doxsc4R7beto8Hl8TSN2TMU3bItcyrUKeB3VjE2AjGRXY+Gvk2ukrB6nxqZYHL+mXLWNoRwSLUFKPtg=">(),
         false
      );
      this.IIiiiiIIllIiiiiIIl = new ililliIiIiilliIi(
         IliIlllilIi<"IliIlllilIi","K8gBYCdBea2ggPGLyQS4wvn5RptyMzbYD72hIbgBaV8sgWo=">(),
         IliIlllilIi<"IliIlllilIi","SC9KYqsV8gc3atxNqNYkHrwvZG6f1gDKixfojE/aK/Ju3f9pXMdwDG5EcGsE3dflUwAeVQTHzqoYJXU95QyR/6+lKActj8zIl5HAG35gqDkb73svaRPEVk0rdttY87PN96OQtxFSXvbDDRCloxJ77XIJ5TA=">(),
         IliIlllilIi<"IliIlllilIi","K8gBYCdBea2ggPGLyQS4wvn5RptyMzbYD72hIbgBaV8sgWo=">(),
         this::iiiIlIIIll
      );
      this.IIIiiiIIllIIiiiIIl.lIiiIiIlilli();
      this.IlIlllIlilIl(
         new IilliIllilliIl[]{
            this.IIIiiiIIllIIiiiIIl,
            this.iIIiiiIIlIlIiiiIIl,
            this.llIiiiIIlilIiiiIIl,
            this.IiIiiiIIlliIiiiIIl,
            this.iiIiiiIIlIIliiiIIl,
            this.lIliiiIIliIliiiIIl,
            this.IlliiiIIlllliiiIIl,
            this.illiiiIIlIiliiiIIl,
            this.liliiiIIliiliiiIIl,
            this.IIiiiiIIllIiiiiIIl
         }
      );
   }

   public iiIiiilIIliiil ilillIiill() {
      return this.lIliiiIIliIliiiIIl;
   }

   private static void IiIilliIil(iiiIiIlIIIliIl L, float g, float r, float t) {
      for (int var4 = 0; var4 < 4; var4++) {
         L.iIlIlllllill((float)var4 * 90.0F, g, g + r, t);
      }
   }

   public void Iillllilll(int index) {
      if (index >= 0 && index < this.IIIiiiIIllIIiiiIIl.IiIiliIiiiIi().size()) {
         this.IIIiiiIIllIIiiiIIl.Iiilliiliiil(index);
      }
   }

   public int lllllillll() {
      return this.IIIiiiIIllIIiiiIIl.Ililllililil();
   }

   private static void iiIilIIlil(iiiIiIlIIIliIl D, float leg, float r, float t) {
      float var4 = t / 2.0F;

      for (byte var5 = -1; var5 <= 1; var5 += 2) {
         for (byte var6 = -1; var6 <= 1; var6 += 2) {
            D.liiiIIllIl((float)var5 * (leg - r), (float)var6 * leg - var4, (float)var5 * leg, (float)var6 * leg + var4);
            D.liiiIIllIl((float)var5 * leg - var4, (float)var6 * (leg - r), (float)var5 * leg + var4, (float)var6 * (leg - var4));
         }
      }
   }

   public float ilIllIiIll(String styleName) {
      iiiIiIlIIIliIl var2 = new iiiIiIlIIIliIl(
         0.0F,
         0.0F,
         this.iiIiiiIIlIIliiiIIl.Iilllilliill(),
         this.lIliiiIIliIliiiIIl.Iilllilliill(),
         this.illiiiIIlIiliiiIIl.Iilllilliill(),
         this.IlliiiIIlllliiiIIl.Iilllilliill(),
         true
      );
      this.llIililIil(var2, styleName, 1.0F, 0.0F);
      return Math.max(1.0F, var2.IliIlllilIi());
   }

   private void iiiIlIIIll() {
      class_310 var1 = class_310.method_1551();
      var1.method_1507(new llIlllllilIlllll(var1.field_1755, this));
   }

   public int liIlliiIll() {
      long var2 = -7615429116894922813L;
      var2 ^= (
            (long)(
                     (this.iIIiiiIIlIlIiiiIIl.Iilllilliill() * (-(1013269298 << 9 | 1013269298 >>> 23) ^ 897162135) + this.llIiiiIIlilIiiiIIl.Iilllilliill())
                           * (((1190915295 + 65 ^ 75) >>> 5 | (1190915295 + 65 ^ 75) << 27) ^ 1513611124)
                        + this.IiIiiiIIlliIiiiIIl.Iilllilliill()
                  )
                  << 32
               ^ var2
         )
         & -1L << 32;
      return (int)(var2 >>> 32) * ((-1636043720 - 89 >>> 27 | -1636043720 - 89 << 5) + -107 ^ -813794432)
         + (this.lIliiiIIliIliiiIIl.Iilllilliill() ? 4 : 0)
         + (this.illiiiIIlIiliiiIIl.Iilllilliill() ? 2 : 0)
         + (this.IlliiiIIlllliiiIIl.Iilllilliill() ? 1 : 0);
   }
}

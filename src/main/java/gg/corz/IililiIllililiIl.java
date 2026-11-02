package gg.corz;

import com.corz.client.CorzClient;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import net.minecraft.class_1297;
import net.minecraft.class_1306;
import net.minecraft.class_1309;
import net.minecraft.class_1664;
import net.minecraft.class_1684;
import net.minecraft.class_1802;
import net.minecraft.class_243;
import net.minecraft.class_332;
import net.minecraft.class_3532;
import net.minecraft.class_3726;
import net.minecraft.class_3959;
import net.minecraft.class_3965;
import net.minecraft.class_4184;
import net.minecraft.class_4587;
import net.minecraft.class_4588;
import net.minecraft.class_638;
import net.minecraft.class_742;
import net.minecraft.class_746;
import net.minecraft.class_7920;
import net.minecraft.class_8685;
import net.minecraft.class_239.class_240;
import net.minecraft.class_3959.class_242;
import net.minecraft.class_3959.class_3960;
import org.joml.Matrix4f;
import org.joml.Vector3fc;

public class IililiIllililiIl extends ilIllIiIll {
   private double IlIIlIIlll;
   private static final double llliIIIlll = 2.25;
   private final float[] iIiiIIIlll;
   private final int[] IliiIIIlll;
   private double iIIIlIIlll;
   private final iiIiiilIIliiil IiilIIIlll;
   private static final float liIiIIIlll = 1.25F;
   private final int[] lliiIIIlll;
   private static final double iIliIIIlll = 2.5;
   private final iiIiiilIIliiil llilIIIlll = new iiIiiilIIliiil(
      IliIlllilIi<"IliIlllilIi","XsMGgM1nwKv6DlmlN4NTkYQXpMe/T6zoVe6/q/SYrFqlKTVEB7I=">(),
      IliIlllilIi<"IliIlllilIi","DUZvpuXHkEdEXieGVZiqYyAvSFbkO4OfAl7TuGnNC6rP8/i65hgas5NcRu7ATUl/V+bthnPDiUIhrezj1YPE2I3owwc=">(),
      false
   );
   private final double[] IiiiIIIlll;
   private double ilIIlIIlll;
   private static final float ilIiIIIlll = 0.24F;
   private final iiIiiilIIliiil ililIIIlll = new iiIiiilIIliiil(
      IliIlllilIi<"IliIlllilIi","OuUklhidb1xK5OfJam6iPQ5/51LCltX4BDslPHlrcT6ME5KEbkIbPxg=">(),
      IliIlllilIi<"IliIlllilIi","GD8YTDG1cGRyR9059uiszj29ZF9yK779PSVg4I6SQE4xv6M3YQ65AH/pvE24thACCauWryhEP3ubGl9hZzGZEOxliJMdLo+yAAjvnG+54zJwYbiFnarS9JsG0hIgbb5rlBvsZiZj">(),
      true
   );
   private final List<lIlIllliIlIlll> IIiiIIIlll;
   private double llIIlIIlll;
   private static final float iiIiIIIlll = 2.0F;
   private final IIIIlilllIIIlill lIIiIIIlll;
   private static final float IIliIIIlll = 0.3F;
   private final List<lIlIllliIlIlll> iiliIIIlll;
   private final Int2ObjectOpenHashMap<lIlIllliIlIlll> illiIIIlll;
   private final int[] liiiIIIlll;
   private double liIIlIIlll;
   private final iiIiiilIIliiil iiilIIIlll;
   private static final double IlliIIIlll = 6.25;
   private static final int IlIiIIIlll = 5;
   private static final float lIliIIIlll = 1.8F;
   private final class_4587 IIIIlIIlll;
   private final int[] iliiIIIlll;
   private int iiIIlIIlll;
   private static final float IiIiIIIlll = 0.12F;
   private final double[] lIiiIIIlll;
   private long IIlIlIIlll;
   private double IiIIlIIlll;
   private final iiIiiilIIliiil liilIIIlll;
   private final int[] iiiiIIIlll;
   private static final int iIIiIIIlll = 300;
   private final iiIiiilIIliiil IIIiIIIlll;
   private WeakReference<class_638> lIIIlIIlll;
   private static final float llIiIIIlll = 0.14F;
   private final lIlIllliIlIlll IiliIIIlll;
   private final List<lIlIllliIlIlll> liliIIIlll;

   @Override
   public void IIiilIiiiIii(illlllIillll event) {
      this.iiliIIIlll.clear();
      if (Iiiilllliiilll.field_1687 != null && Iiiilllliiilll.field_1724 != null) {
         class_4184 var2 = Iiiilllliiilll.field_1773.method_19418();
         if (var2 != null) {
            if (this.lIIIlIIlll.get() != Iiiilllliiilll.field_1687) {
               this.iiiIlIIIll();
               this.lIIIlIIlll = new WeakReference<>(Iiiilllliiilll.field_1687);
            }

            long var3 = System.nanoTime();
            float var5 = this.IIlIlIIlll == 0L ? 0.016F : Math.min(0.1F, (float)(var3 - this.IIlIlIIlll) / 1.0E9F);
            this.IIlIlIIlll = var3;
            float var6 = event.liiiiIIiiiiiiIIi;
            class_243 var7 = var2.method_71156();
            ObjectIterator var8 = this.illiIIIlll.values().iterator();

            while (var8.hasNext()) {
               lIlIllliIlIlll var9 = (lIlIllliIlIlll)var8.next();
               var9.liilIIiiliiilIIiil = false;
            }

            this.IiliIIIlll.liilIIiiliiilIIiil = false;

            for (class_1297 var18 : Iiiilllliiilll.field_1687.method_18112()) {
               if (var18 instanceof class_1684) {
                  class_1684 var10 = (class_1684)var18;
                  if (!var10.method_31481()) {
                     class_1297 var11 = var10.method_24921();
                     if (!this.llilIIIlll.Iilllilliill() || var11 != Iiiilllliiilll.field_1724) {
                        lIlIllliIlIlll var12 = (lIlIllliIlIlll)this.illiIIIlll.get(var10.method_5628());
                        if (var12 == null) {
                           var12 = new lIlIllliIlIlll();
                           this.illiIIIlll.put(var10.method_5628(), var12);
                        }

                        this.lIIlliIIll(var12, var10, var11, var6);
                     }
                  }
               }
            }

            if (this.ililIIIlll.Iilllilliill() && this.lIliliIlil()) {
               this.ilIllIiIll(this.IiliIIIlll, var6);
            }

            this.liliIIIlll.clear();
            var8 = this.illiIIIlll.values().iterator();

            while (var8.hasNext()) {
               lIlIllliIlIlll var19 = (lIlIllliIlIlll)var8.next();
               if (this.Iillllilll(var19, var5, var7)) {
                  this.liliIIIlll.add(var19);
               }
            }

            this.illiIIIlll.values().removeIf(t -> !t.liilIIiiliiilIIiil && t.IiiIIIiilliiIIIiil <= 0.004F);
            if (this.Iillllilll(this.IiliIIIlll, var5, var7)) {
               this.liliIIIlll.add(this.IiliIIIlll);
            }

            if (!this.liliIIIlll.isEmpty()) {
               this.liliIIIlll.sort((b, a) -> Double.compare(a.lliIIIiililiIIIiil, b.lliIIIiililiIIIiil));
               Matrix4f var17 = event.IliiiIIilliiiIIi.method_23760().method_23761();
               boolean var20 = this.IIIiIIIlll.Iilllilliill();
               float var21 = Math.max(1.2F, (float)this.lIIiIIIlll.Iilllilliill() * (float)Iiiilllliiilll.method_22683().method_4506() / 1080.0F);

               for (lIlIllliIlIlll var25 : this.liliIIIlll) {
                  this.iilllIIill(event.IliiiIIilliiiIIi, var17, var2, var7, var25, var21, var20);
               }

               for (lIlIllliIlIlll var26 : this.liliIIIlll) {
                  this.llIililIil(var17, var2, var26, var21, var20);
               }

               iIiiIIilIliiIIil.IiIiliIiiiIi();
               boolean var24 = this.iiilIIIlll.Iilllilliill();

               for (lIlIllliIlIlll var13 : this.liliIIIlll) {
                  boolean var14 = var24 && var13.illiIIiilIiliIIiil && (var20 || this.Ilillllill(var7, var13));
                  var13.IlIlIIiilllIlIIiil = Illiiiilllliiiil.lIiiIiIlilli(var13.IlIlIIiilllIlIIiil + (var14 ? var5 : -var5) / 0.12F);
                  if (var13.llIiIIiililIiIIiil && var13.IlIlIIiilllIlIIiil > 0.02F) {
                     this.iiliIIIlll.add(var13);
                  }
               }
            }
         }
      }
   }

   private boolean lIliliIlil() {
      return Iiiilllliiilll.field_1724.method_6047().method_31574(class_1802.field_8634)
         || Iiiilllliiilll.field_1724.method_6079().method_31574(class_1802.field_8634);
   }

   public IililiIllililiIl() {
      super(IliIlllilIi<"IliIlllilIi","462hLVxp9tCsz5scNPFE+TtYuwHkFpjhqxhApBl89ri6Q1uVxbIJaNGUPsQ=">(), lllIllillIll.llIlIIIiilIlIIIi);
      this.IiilIIIlll = new iiIiiilIIliiil(
         IliIlllilIi<"IliIlllilIi","WI4YLHIn/WmHbnkM7ayPCmBphzU2+BdyRqbJOnG2iMNiapIiwOws">(),
         IliIlllilIi<"IliIlllilIi","zcU9perGXC6fz5W1hIk/V4/P5Njc68gjoEd1H8EVfOZjc8LEibSLJDKRNQBP/vZhqBA1NG2Ugmau8V3sUd0C2hC+NKdC5eEb87NnQoXAIpZpzk+GeRY=">(),
         true
      );
      this.liilIIIlll = new iiIiiilIIliiil(
         IliIlllilIi<"IliIlllilIi","dIEYsMk6D4OCZ9wu6zrCvxgKKDQqKO3bqf+aPs45c9YHZfTnWwvu">(),
         IliIlllilIi<"IliIlllilIi","UxlATFnJUiH4VnE0sLwniARigRC3JwvEWnsxQumtOIBvrq4jGrnTjRiNWz1kGAXFc6LoC0LrpZJ5N7ZUD56NsR6ND2pEjTvBI7kr/I1vpu+I/k4iC3qt">(),
         true
      );
      this.iiilIIIlll = new iiIiiilIIliiil(
         IliIlllilIi<"IliIlllilIi","VtmrV+DAArNCArWVHUe043449tUpAPX37SbFPdLyR33y">(),
         IliIlllilIi<"IliIlllilIi","IR3kzLqonGWXraxV3rKlM3XiTPcLFOMSNPrigyIYwlnNLkrwt3UPFFhrvJzO2Vi+2L0kK6EaXzyPltG8ekJTk5Ql4ECapPVvIVB0Pg0o7nEEqhU1nyhj9ZxOT9Y=">(),
         true
      );
      this.IIIiIIIlll = new iiIiiilIIliiil(
         IliIlllilIi<"IliIlllilIi","KuyavVFQeTIvclSNpNGjc2bbNC7+oHx6TjahOc1mGSwtlllEPBrju1o=">(),
         IliIlllilIi<"IliIlllilIi","i5FP1I6SWAHr/47wG1i3yxbv8R4bD7L8dc3+cBzImfc7uCqRkdNWRKYbyxwRppuCJpOs+dwkKTKSNsQSQpvYxgjAOOfsmwrVuDhvPRKeRQ==">(),
         true
      );
      this.lIIiIIIlll = new IIIIlilllIIIlill(
         IliIlllilIi<"IliIlllilIi","Ew4ackmrU+safoOYW9DQ+x7PyiAXpRk5luCzlu43l8ml6D/Qj2E=">(),
         IliIlllilIi<"IliIlllilIi","8w0Axr5SMk68GvHV0/ulUuxCsgqDMPsBhgweMlDj45r2blw1fc0qZQE+zJfduJYInR/NOe+WNEc=">(),
         2.0,
         1.0,
         4.0,
         0.5
      );
      this.illiIIIlll = new Int2ObjectOpenHashMap();
      this.IiliIIIlll = new lIlIllliIlIlll();
      this.liliIIIlll = new ArrayList<>();
      this.iiliIIIlll = new ArrayList<>();
      this.IIiiIIIlll = new ArrayList<>();
      this.lIiiIIIlll = new double[4584];
      this.iIiiIIIlll = new float[1528];
      this.IliiIIIlll = new int[this.iIiiIIIlll.length];
      this.lliiIIIlll = new int[this.iIiiIIIlll.length];
      this.iliiIIIlll = new int[this.iIiiIIIlll.length];
      this.IiiiIIIlll = new double[6];
      this.liiiIIIlll = new int[2];
      this.iiiiIIIlll = new int[2];
      this.IIIIlIIlll = new class_4587();
      this.lIIIlIIlll = new WeakReference<>(null);
      this.iiIIlIIlll = Integer.MIN_VALUE;
      this.IlIlllIlilIl(
         new IilliIllilliIl[]{this.llilIIIlll, this.ililIIIlll, this.IiilIIIlll, this.liilIIIlll, this.iiilIIIlll, this.IIIiIIIlll, this.lIIiIIIlll}
      );
   }

   private boolean IlIllllIll(lIlIllliIlIlll pearl, class_1684 t, class_243 p) {
      long var6 = 1396087639215322242L;
      if (pearl.liIiiililiiIiiilil != null && pearl.liIiiililiiIiiilil.iIilIIiiIlilIIii) {
         var6 ^= ((long)(t.field_6012 - pearl.iIIIIIiilIlIIIIiil - pearl.liIiiililiiIiiilil.lIllIIiiiIllIIii) << 32 ^ var6) & -1L << 32;
         if ((int)(var6 >>> 32) < 0) {
            return false;
         } else if (pearl.liIiiililiiIiiilil.IIilIIiilIilIIii < 0) {
            return p.method_1025(pearl.liIiiililiiIiiilil.llIlIIiiilIlIIii) < Double.longBitsToDouble(-348843926790746317L ^ -4262472002975707341L);
         } else {
            class_1297 var5 = Iiiilllliiilll.field_1687.method_8469(pearl.liIiiililiiIiiilil.IIilIIiilIilIIii);
            return var5 != null && var5.method_5829().method_1014(Double.longBitsToDouble(-7103029233484469405L ^ -6720884749753709307L)).method_1006(p)
               || pearl.IIIiIIiillIIiIIiil && (int)(var6 >>> 32) < (~((-481732244 >>> 15 | -481732244 << 17) + -61) ^ 1294350752);
         }
      } else {
         return false;
      }
   }

   private void iilllIIill(class_4587 width, Matrix4f t, class_4184 stack, class_243 m, lIlIllliIlIlll through, float camera, boolean cam) {
      long var16 = 7867545532822903871L;
      if (through.iIIiIIiilIlIiIIiil && through.llIiIIiililIiIIiil) {
         float var8 = through.IlliIIiilllliIIiil ? through.iiiIIIiilIIIlIIiil * (1.0F - this.lIilliIill(through)) : through.iiiIIIiilIIIlIIiil;
         if (!(var8 < 0.04F)) {
            through.lIIlIIiiliIIlIIiil = var8;
            through.illiIIiilIiliIIiil = true;
            var16 ^= ((long)(this.IiilIIIlll.Iilllilliill() && through.llliiilililliiilil != null ? 1 : 0) << 32 ^ var16) & -1L << 32;
            if ((int)(var16 >>> 32) != 0 || this.liilIIIlll.Iilllilliill()) {
               double var10 = through.lilIIIiiliilIIIiil - m.field_1352;
               double var12 = through.IIiIIIiillIiIIIiil - m.field_1351;
               double var14 = through.iIiIIIiilIliIIIiil - m.field_1350;
               if (through.IiIiIIiilliIiIIiil) {
                  ilIIllllIiIIllll.IIlllIlliIll(t, var10, var12, var14, through.iliiiililIiiiiilil, var8);
               }

               if ((int)(var16 >>> 32) != 0) {
                  ilIIllllIiIIllll.lIiiIiIlilli(
                     width,
                     var10,
                     var12,
                     var14,
                     through.IIllIIiillIllIIiil,
                     through.llliiilililliiilil,
                     through.iiIiIIiilIIliIIiil,
                     through.Iliiiilillliiiilil,
                     through.ilIlIIiilIiIlIIiil,
                     var8,
                     through.iliiiililIiiiiilil,
                     cam
                  );
               } else {
                  this.ilillIiill(t, stack, through, var10, var12, var14, camera, cam);
               }
            }
         }
      }
   }

   private boolean IiIilliIil(lIlIllliIlIlll t, float factor) {
      if (t.lIIlIIiiliIIlIIiil * t.IlIlIIiilllIlIIiil < 0.02F) {
         return false;
      } else {
         class_243 var3 = llilllililll.iIlIlllllill(new class_243(t.lilIIIiiliilIIIiil, t.IIiIIIiillIiIIIiil - 0.1, t.iIiIIIiilIliIIIiil));
         if (var3 != null && !(var3.field_1350 <= 0.0) && !(var3.field_1350 >= 1.0)) {
            int var4 = IIliiilllIliiill.IilliliilIIi(t.iIllIIiilIlllIIiil);
            if (var4 != t.liiiiililiiiiiilil) {
               t.liiiiililiiiiiilil = var4;
               t.iiliiililIIiiiilil = IIliiilllIliiill.lIiiIiIlilli(var4);
            }

            t.ililIIiilIiilIIiil = class_3532.method_15363(1.12F - (float)t.lliIIIiililiIIIiil / 56.0F, 0.72F, 1.0F);
            t.IillIIiillillIIiil = (float)(var3.field_1352 / (double)factor);
            t.iillIIiilIIilIIiil = (float)(var3.field_1351 / (double)factor) + 5.0F * t.ililIIiilIiilIIiil;
            t.lIilIIiiliIilIIiil = IiillIlliillIl.IliIlllilIi(t.ililIIiilIiilIIiil, t.Iiliiililliliiilil, t.iiliiililIIiiiilil);
            t.IlilIIiilllilIIiil = 16.0F * t.ililIIiilIiilIIiil;
            return true;
         } else {
            return false;
         }
      }
   }

   private void llIililIil(Matrix4f through, class_4184 width, lIlIllliIlIlll m, float t, boolean camera) {
      if (m.lIiiiililiIiiiilil >= 2 && !(m.iiIIIIiilIIlIIIiil - m.IiIIIIiilliIIIIiil < 0.001) && !(m.iiiIIIiilIIIlIIiil < 0.02F)) {
         int var6 = IIillllIilll.iIlIlllllill(m.ilIiiililIiIiiilil, m.lIiiiililiIiiiilil, m.IiIIIIiilliIIIIiil, m.iiIIIIiilIIlIIIiil, 5, this.lIiiIIIlll);
         if (var6 >= 2) {
            this.iIiiIIIlll[0] = 0.0F;

            for (int var7 = 1; var7 < var6; var7++) {
               double var8 = this.lIiiIIIlll[var7 * 3] - this.lIiiIIIlll[var7 * 3 - 3];
               double var10 = this.lIiiIIIlll[var7 * 3 + 1] - this.lIiiIIIlll[var7 * 3 - 2];
               double var12 = this.lIiiIIIlll[var7 * 3 + 2] - this.lIiiIIIlll[var7 * 3 - 1];
               this.iIiiIIIlll[var7] = this.iIiiIIIlll[var7 - 1] + (float)Math.sqrt(var8 * var8 + var10 * var10 + var12 * var12);
            }

            float var18 = this.iIiiIIIlll[var6 - 1];
            boolean var19 = !m.liIiiililiiIiiilil.iIilIIiiIlilIIii;
            int var9 = ilIIllllIiIIllll.Illlllllilll(m.iliiiililIiiiiilil, 0.25F);
            Vector3fc var20 = width.method_19336();
            Vector3fc var11 = width.method_35689();

            for (int var21 = 0; var21 < var6; var21++) {
               float var13 = this.iIiiIIIlll[var21];
               float var14 = m.lIliIIiiliIliIIiil ? IIliiilllIliiill.IliIlllilIi((var13 - 0.5F) / 2.5F) : IIliiilllIliiill.IliIlllilIi(var13 / 0.6F);
               if (var19) {
                  var14 *= IIliiilllIliiill.IliIlllilIi((var18 - var13) / 4.0F);
               }

               var14 *= m.iiiIIIiilIIIlIIiil;
               if (m.lIliIIiiliIliIIiil) {
                  float var15 = IIliiilllIliiill.IlIlllIlilIl(var13, var18);
                  float var16 = 0.32F * m.llllIIiililllIIiil * var15;
                  float var17 = -0.14F * var15;
                  this.lIiiIIIlll[var21 * 3] = this.lIiiIIIlll[var21 * 3] + (double)(var11.x() * var16 + var20.x() * var17);
                  this.lIiiIIIlll[var21 * 3 + 1] = this.lIiiIIIlll[var21 * 3 + 1] + (double)(var11.y() * var16 + var20.y() * var17);
                  this.lIiiIIIlll[var21 * 3 + 2] = this.lIiiIIIlll[var21 * 3 + 2] + (double)(var11.z() * var16 + var20.z() * var17);
               }

               this.IliiIIIlll[var21] = ilIIllllIiIIllll.Iilllilliill(var9, 0.95F * var14);
               this.lliiIIIlll[var21] = ilIIllllIiIIllll.Iilllilliill(m.iliiiililIiiiiilil, 0.14F * var14);
               this.iliiIIIlll[var21] = ilIIllllIiIIllll.Iilllilliill(m.iliiiililIiiiiilil, 0.3F * var14);
            }

            boolean var22 = !var19;
            if (camera) {
               IIillllIilll.liiiIIllIl(iIiiIIilIliiIIil.IilliliilIIi(), through, width, this.lIiiIIIlll, this.iliiIIIlll, var6, t, 1.25F, false, var22);
            }

            class_4588 var23 = iIiiIIilIliiIIil.lIiiIiIlilli();
            float var25 = t * 2.0F + 2.0F;
            IIillllIilll.liiiIIllIl(var23, through, width, this.lIiiIIIlll, this.lliiIIIlll, var6, var25, var25, false, false);
            IIillllIilll.liiiIIllIl(var23, through, width, this.lIiiIIIlll, this.IliiIIIlll, var6, t, 1.25F, false, var22);
         }
      }
   }

   private static void liilliiill(
      class_4588 y0, Matrix4f yc, float faint, float low, float bz, float mid, float y1, float bx, float m, int vc, int ax, int top, int az
   ) {
      if (bx - y1 > 0.001F) {
         iIiiIIilIliiIIil.IlIlllIlilIl(y0, yc, faint, y1, low, vc, bz, y1, mid, vc, bz, bx, mid, ax, faint, bx, low, ax);
      }

      if (m - bx > 0.001F) {
         iIiiIIilIliiIIil.IlIlllIlilIl(y0, yc, faint, bx, low, top, bz, bx, mid, top, bz, m, mid, az, faint, m, low, az);
      }
   }

   private boolean Iillllilll(lIlIllliIlIlll cam, float t, class_243 dt) {
      cam.illiIIiilIiliIIiil = false;
      cam.IiiIIIiilliiIIIiil = Illiiiilllliiiil.lIiiIiIlilli(cam.IiiIIIiilliiIIIiil + (cam.liilIIiiliiilIIiil ? t / 0.14F : -t / 0.24F));
      if (cam.liIiiililiiIiiilil != null && !(cam.IiiIIIiilliiIIIiil <= 0.004F)) {
         cam.iiiIIIiilIIIlIIiil = 1.0F - (1.0F - cam.IiiIIIiilliiIIIiil) * (1.0F - cam.IiiIIIiilliiIIIiil) * (1.0F - cam.IiiIIIiilliiIIIiil);
         if (cam.iIIiIIiilIlIiIIiil) {
            double var4 = cam.lIlIIIiiliIlIIIiil - cam.lilIIIiiliilIIIiil;
            double var6 = cam.IllIIIiillllIIIiil - cam.IIiIIIiillIiIIIiil;
            double var8 = cam.illIIIiilIilIIIiil - cam.iIiIIIiilIliIIIiil;
            if (cam.llIiIIiililIiIIiil && !(var4 * var4 + var6 * var6 + var8 * var8 > 2.25)) {
               double var10 = 1.0 - Math.exp((double)(-t) / 0.05);
               cam.lilIIIiiliilIIIiil += var4 * var10;
               cam.IIiIIIiillIiIIIiil += var6 * var10;
               cam.iIiIIIiilIliIIIiil += var8 * var10;
            } else {
               cam.lilIIIiiliilIIIiil = cam.lIlIIIiiliIlIIIiil;
               cam.IIiIIIiillIiIIIiil = cam.IllIIIiillllIIIiil;
               cam.iIiIIIiilIliIIIiil = cam.illIIIiilIilIIIiil;
               cam.ilIlIIiilIiIlIIiil = cam.liIlIIiiliiIlIIiil;
               cam.llIiIIiililIiIIiil = true;
            }

            cam.lliIIIiililiIIIiil = Math.sqrt(dt.method_1028(cam.lilIIIiiliilIIIiil, cam.IIiIIIiillIiIIIiil, cam.iIiIIIiilIliIIIiil));
         } else {
            cam.llIiIIiililIiIIiil = false;
            cam.lliIIIiililiIIIiil = cam.IIliiilillIliiilil == null ? 0.0 : Math.sqrt(dt.method_1025(cam.IIliiilillIliiilil));
         }

         cam.ilIlIIiilIiIlIIiil = cam.ilIlIIiilIiIlIIiil + (cam.liIlIIiiliiIlIIiil - cam.ilIlIIiilIiIlIIiil) * (1.0F - (float)Math.exp((double)(-t / 0.08F)));
         return true;
      } else {
         if (!cam.liilIIiiliiilIIiil) {
            cam.llIiIIiililIiIIiil = false;
            cam.IlIlIIiilllIlIIiil = 0.0F;
         }

         return false;
      }
   }

   private boolean Ilillllill(class_243 t, lIlIllliIlIlll cam) {
      return !cam.llIiIIiililIiIIiil
         ? false
         : Iiiilllliiilll.field_1687
               .method_17742(
                  new class_3959(
                     t,
                     new class_243(
                        cam.lilIIIiiliilIIIiil,
                        cam.IIiIIIiillIiIIIiil + Double.longBitsToDouble(81173221569581539L ^ 4525183391417356771L),
                        cam.iIiIIIiilIliIIIiil
                     ),
                     class_3960.field_23142,
                     class_242.field_1348,
                     class_3726.method_16194()
                  )
               )
               .method_17783()
            == class_240.field_1333;
   }

   private void iIIilIlIil(Matrix4f w, class_4184 ax, double m, double az, double by, double through, double bz, double bx, float ay, boolean camera) {
      this.IiiiIIIlll[0] = m;
      this.IiiiIIIlll[1] = az;
      this.IiiiIIIlll[2] = by;
      this.IiiiIIIlll[3] = through;
      this.IiiiIIIlll[4] = bz;
      this.IiiiIIIlll[5] = bx;
      if (camera) {
         IIillllIilll.liiiIIllIl(iIiiIIilIliiIIil.IilliliilIIi(), w, ax, this.IiiiIIIlll, this.iiiiIIIlll, 2, ay, 1.25F, false, false);
      }

      IIillllIilll.liiiIIllIl(iIiiIIilIliiIIil.lIiiIiIlilli(), w, ax, this.IiiiIIIlll, this.liiiIIIlll, 2, ay, 1.25F, false, false);
   }

   private void IIIillIIil(Matrix4f x1, class_4184 w, double camera, double x0, double through, double z1, double z0, float y, boolean m) {
      this.iIIilIlIil(x1, w, camera, z0, x0, through, z0, x0, y, m);
      this.iIIilIlIil(x1, w, through, z0, x0, through, z0, z1, y, m);
      this.iIIilIlIil(x1, w, through, z0, z1, camera, z0, z1, y, m);
      this.iIIilIlIil(x1, w, camera, z0, z1, camera, z0, x0, y, m);
   }

   private void ilillIiill(Matrix4f rx, class_4184 camera, lIlIllliIlIlll through, double m, double width, double rz, float t, boolean ry) {
      float var12 = (float)(m - 0.3F);
      float var13 = (float)(m + 0.3F);
      float var14 = (float)(rz - 0.3F);
      float var15 = (float)(rz + 0.3F);
      float var16 = (float)width;
      float var17 = (float)(width + 1.8F);
      float var18 = var16 + (var17 - var16) * Illiiiilllliiiil.lIiiIiIlilli(through.ilIlIIiilIiIlIIiil);
      float var19 = through.lIIlIIiiliIIlIIiil;
      int var20 = ilIIllllIiIIllll.Iilllilliill(through.iliiiililIiiiiilil, 0.22F * var19);
      int var21 = ilIIllllIiIIllll.Iilllilliill(through.iliiiililIiiiiilil, 0.12F * var19);
      int var22 = ilIIllllIiIIllll.Iilllilliill(through.iliiiililIiiiiilil, 0.06F * var19);
      int var23 = ilIIllllIiIIllll.Iilllilliill(through.iliiiililIiiiiilil, 0.02F * var19);
      class_4588 var24 = iIiiIIilIliiIIil.lIiiIiIlilli();
      liilliiill(var24, rx, var12, var14, var13, var14, var16, var18, var17, var20, var21, var22, var23);
      liilliiill(var24, rx, var13, var14, var13, var15, var16, var18, var17, var20, var21, var22, var23);
      liilliiill(var24, rx, var13, var15, var12, var15, var16, var18, var17, var20, var21, var22, var23);
      liilliiill(var24, rx, var12, var15, var12, var14, var16, var18, var17, var20, var21, var22, var23);
      Arrays.fill(this.liiiIIIlll, ilIIllllIiIIllll.Iilllilliill(ilIIllllIiIIllll.Illlllllilll(through.iliiiililIiiiiilil, 0.25F), 0.9F * var19));
      Arrays.fill(this.iiiiIIIlll, ilIIllllIiIIllll.Iilllilliill(through.iliiiililIiiiiilil, 0.28F * var19));
      float var25 = Math.max(1.2F, t * 0.75F);
      float var26 = IIillllIilll.IliIlllilIi();
      double var27 = through.IiIiIIiilliIiIIiil && var26 > 0.001F ? 0.5 * (double)(var25 + 1.25F) * (through.lliIIIiililiIIIiil + 0.5) / (double)var26 : 0.0;
      double var29 = through.lilIIIiiliilIIIiil - 0.3F;
      double var31 = through.lilIIIiiliilIIIiil + 0.3F;
      double var33 = through.iIiIIIiilIliIIIiil - 0.3F;
      double var35 = through.iIiIIIiilIliIIIiil + 0.3F;
      double var37 = through.IIiIIIiillIiIIIiil + var27;
      double var39 = through.IIiIIIiillIiIIIiil + 1.8F;
      this.IIIillIIil(rx, camera, var29, var33, var31, var35, var37, var25, ry);
      this.IIIillIIil(rx, camera, var29, var33, var31, var35, var39, var25, ry);
      this.iIIilIlIil(rx, camera, var29, var37, var33, var29, var39, var33, var25, ry);
      this.iIIilIlIil(rx, camera, var31, var37, var33, var31, var39, var33, var25, ry);
      this.iIIilIlIil(rx, camera, var31, var37, var35, var31, var39, var35, var25, ry);
      this.iIIilIlIil(rx, camera, var29, var37, var35, var29, var39, var35, var25, ry);
   }

   @Override
   public void Iliilliiilii(lIiIlliiIiIlli event) {
      if (!this.iiliIIIlll.isEmpty() && Iiiilllliiilll.field_1687 != null && Iiiilllliiilll.field_1724 != null) {
         if (Iiiilllliiilll.field_1755 == null && !Iiiilllliiilll.field_1690.field_1842) {
            class_332 var2 = event.IIiIilIIIl;
            CorzClient.fontManager.iIlIlllllill(this.IIIIlIIlll);
            IIIiiIillIIiiIil.IliIlllilIi(this.IIIIlIIlll);
            double var3 = (double)Iiiilllliiilll.method_22683().method_4495();
            int var5 = Iiiilllliiilll.method_22683().method_4476(IIililillIililil.iiiIlIIIll(Iiiilllliiilll), Iiiilllliiilll.method_1573());
            float var6 = (float)((double)var5 / var3);
            boolean var7 = Math.abs(var6 - 1.0F) > 1.0E-4F;
            if (var7) {
               IliiIilliiIi.lIIlllIIliIIlllIIl = (float)Math.round((float)Iiiilllliiilll.method_22683().method_4486() / var6);
               IliiIilliiIi.IlIlllIIlllIlllIIl = (float)Math.round((float)Iiiilllliiilll.method_22683().method_4502() / var6);
            }

            try {
               this.iiliIIIlll.sort((b, a) -> Float.compare(b.iIllIIiilIlllIIiil, a.iIllIIiilIlllIIiil));
               this.IIiiIIIlll.clear();

               for (lIlIllliIlIlll var9 : this.iiliIIIlll) {
                  if (this.IiIilliIil(var9, var6)) {
                     int var10 = 0;
                     int var11 = this.IIiiIIIlll.size();

                     while (true) {
                        if (var10 < var11) {
                           boolean var12 = false;

                           for (int var13 = 0; var13 < var11; var13++) {
                              lIlIllliIlIlll var14 = this.IIiiIIIlll.get(var13);
                              if (Math.abs(var14.IillIIiillillIIiil - var9.IillIIiillillIIiil)
                                    < (var14.lIilIIiiliIilIIiil + var9.lIilIIiiliIilIIiil) / 2.0F + 2.0F
                                 && var9.iillIIiilIIilIIiil < var14.iillIIiilIIilIIiil + var14.IlilIIiilllilIIiil + 2.0F
                                 && var14.iillIIiilIIilIIiil < var9.iillIIiilIIilIIiil + var9.IlilIIiilllilIIiil + 2.0F) {
                                 var9.iillIIiilIIilIIiil = var14.iillIIiilIIilIIiil + var14.IlilIIiilllilIIiil + 2.0F;
                                 var12 = true;
                              }
                           }

                           if (var12) {
                              var10++;
                              continue;
                           }
                        }

                        this.IIiiIIIlll.add(var9);
                        break;
                     }
                  }
               }

               for (lIlIllliIlIlll var19 : this.IIiiIIIlll) {
                  this.iiIilIIlil(var2, var19);
               }
            } finally {
               if (var7) {
                  IliiIilliiIi.lIIlllIIliIIlllIIl = 0.0F;
                  IliiIilliiIi.IlIlllIIlllIlllIIl = 0.0F;
               }
            }
         }
      }
   }

   private void lllllillll(lIlIllliIlIlll t) {
      t.IiIiIIiilliIiIIiil = false;
      if (t.liIiiililiiIiiilil.iIilIIiiIlilIIii) {
         class_243 var2 = t.liIiiililiiIiiilil.IiIlIIiiliIlIIii;
         t.lIlIIIiiliIlIIIiil = var2.field_1352;
         t.IllIIIiillllIIIiil = var2.field_1351;
         t.illIIIiilIilIIIiil = var2.field_1350;
         class_3965 var3 = Iiiilllliiilll.field_1687
            .method_17742(
               new class_3959(
                  new class_243(var2.field_1352, var2.field_1351 + Double.longBitsToDouble(9019158641696874862L ^ 4792926656222542068L), var2.field_1350),
                  new class_243(var2.field_1352, var2.field_1351 - Double.longBitsToDouble(4278037028225082592L ^ 8888597146745627872L), var2.field_1350),
                  class_3960.field_17558,
                  class_242.field_1348,
                  class_3726.method_16194()
               )
            );
         if (var3.method_17783() != class_240.field_1333) {
            t.IllIIIiillllIIIiil = var3.method_17784().field_1351;
            t.IiIiIIiilliIiIIiil = true;
         }
      }
   }

   private float lIilliIill(lIlIllliIlIlll t) {
      float var2 = 0.0F;
      ObjectIterator var3 = this.illiIIIlll.values().iterator();

      while (var3.hasNext()) {
         lIlIllliIlIlll var4 = (lIlIllliIlIlll)var3.next();
         if (var4.iIIiIIiilIlIiIIiil && var4.llIiIIiililIiIIiil) {
            double var5 = var4.lilIIIiiliilIIIiil - t.lilIIIiiliilIIIiil;
            double var7 = var4.IIiIIIiillIiIIIiil - t.IIiIIIiillIiIIIiil;
            double var9 = var4.iIiIIIiilIliIIIiil - t.iIiIIIiilIliIIIiil;
            if (var5 * var5 + var7 * var7 + var9 * var9 < 2.25) {
               var2 = Math.max(var2, var4.iiiIIIiilIIIlIIiil);
            }
         }
      }

      return var2;
   }

   private void liIlliiIll(lIlIllliIlIlll td, class_1297 owner, float t) {
      long var7 = -788733236654187374L;
      td.llliiilililliiilil = null;
      if (owner instanceof class_742 var4) {
         class_8685 var5 = var4.method_52814();
         if (var5 != null && var5.comp_1626() != null) {
            td.llliiilililliiilil = var5.comp_1626().comp_3627();
            td.iiIiIIiilIIliIIiil = var5.comp_1629() == class_7920.field_41122;
            td.IIllIIiillIllIIiil = var4.method_5705(t);
            var7 ^= (5862630359040L ^ var7) & -1L << 32;
            if (var4.method_74091(class_1664.field_7563)) {
               var7 ^= ((long)((int)(var7 >>> 32) | 2) << 32 ^ var7) & -1L << 32;
            }

            if (var4.method_74091(class_1664.field_7564)) {
               var7 ^= ((long)((int)(var7 >>> 32) | -60266442 + 29 - 5 ^ -60266426) << 32 ^ var7) & -1L << 32;
            }

            if (var4.method_74091(class_1664.field_7570)) {
               var7 ^= (
                     (long)((int)(var7 >>> 32) | ((~-516161488 << 11 | ~-516161488 >>> 21) << 1 | (~-516161488 << 11 | ~-516161488 >>> 21) >>> 31) ^ 1073541580)
                           << 32
                        ^ var7
                  )
                  & -1L << 32;
            }

            if (var4.method_74091(class_1664.field_7568)) {
               var7 ^= ((long)((int)(var7 >>> 32) | ((~1228217302 - -61 ^ -81) << 19 | (~1228217302 - -61 ^ -81) >>> 13) ^ -565556952) << 32 ^ var7)
                  & -1L << 32;
            }

            if (var4.method_74091(class_1664.field_7565)) {
               var7 ^= ((long)((int)(var7 >>> 32) | ((-926713661 ^ -49) >>> 13 | (-926713661 ^ -49) << 19) ^ 945929188) << 32 ^ var7) & -1L << 32;
            }

            if (var4.method_74091(class_1664.field_7566)) {
               var7 ^= ((long)((int)(var7 >>> 32) | (~-456548459 << 7 | ~-456548459 >>> 25) ^ -1691337459) << 32 ^ var7) & -1L << 32;
            }

            td.Iliiiilillliiiilil = (int)(var7 >>> 32);
         }
      }
   }

   private void IIllllIlll(lIlIllliIlIlll lx, double ly, double lz, double t, boolean last) {
      lIililiIilil var9 = lx.liIiiililiiIiiilil;
      List var10 = var9.liiIIIiiiiiIIIii;
      int var11 = 0;
      if (last) {
         var11 = iIlllIllll(lx.ilIiiililIiIiiilil, var11, ly, lz, t);
      }

      int var12 = var9.iIilIIiiIlilIIii ? var10.size() - 1 : var10.size();

      for (int var13 = 0; var13 < var12; var13++) {
         class_243 var14 = (class_243)var10.get(var13);
         var11 = iIlllIllll(lx.ilIiiililIiIiiilil, var11, var14.field_1352, var14.field_1351, var14.field_1350);
      }

      if (var9.iIilIIiiIlilIIii) {
         class_243 var16 = var9.IiIlIIiiliIlIIii;
         int var15 = iIlllIllll(
            lx.ilIiiililIiIiiilil, var11, var9.iiIlIIiiIIllIIii.field_1352, var9.iiIlIIiiIIllIIii.field_1351, var9.iiIlIIiiIIllIIii.field_1350
         );
         var11 = iIlllIllll(
            lx.ilIiiililIiIiiilil,
            var15,
            2.0 * var9.iiIlIIiiIIllIIii.field_1352 - var16.field_1352,
            2.0 * var9.iiIlIIiiIIllIIii.field_1351 - var16.field_1351,
            2.0 * var9.iiIlIIiiIIllIIii.field_1350 - var16.field_1350
         );
         lx.iiIIIIiilIIlIIIiil = (double)(var11 - 3) + (var9.IlllIIiillllIIii - (double)(var9.lIllIIiiiIllIIii - 1));
      } else {
         lx.iiIIIIiilIIlIIIiil = (double)(var11 - 1);
      }

      lx.lIiiiililiIiiiilil = var11;
   }

   private void iiIilIIlil(class_332 ctx, lIlIllliIlIlll t) {
      float var3 = IliiIilliiIi.IilliliilIIi(t.lIIlIIiiliIIlIIiil * t.IlIlIIiilllIlIIiil);

      try {
         IiillIlliillIl.liiiIIllIl(
            ctx,
            t.IillIIiillillIIiil,
            t.iillIIiilIIilIIiil - 5.0F * t.ililIIiilIiilIIiil,
            t.ililIIiilIiilIIiil,
            t.Iiliiililliliiilil,
            t.iiliiililIIiiiilil,
            t.IlliIIiilllliIIiil ? 0.0F : t.ilIlIIiilIiIlIIiil,
            (-1835464094 * 954437177 * 349184333 << 5 | -1835464094 * 954437177 * 349184333 >>> 27) * 57 ^ 1801007085 | t.iliiiililIiiiiilil
         );
      } finally {
         IliiIilliiIi.lIiiIiIlilli(var3);
      }
   }

   private static int iIlllIllll(double[] x, int z, double ctrl, double c, double y) {
      x[z * 3] = ctrl;
      x[z * 3 + 1] = c;
      x[z * 3 + 2] = y;
      return z + 1;
   }

   private void ilIllIiIll(lIlIllliIlIlll t, float td) {
      class_746 var3 = Iiiilllliiilll.field_1724;
      double var4 = class_3532.method_16436((double)td, var3.field_6014, var3.method_23317());
      double var6 = class_3532.method_16436((double)td, var3.field_6036, var3.method_23318()) + (double)var3.method_5751() - 0.1F;
      double var8 = class_3532.method_16436((double)td, var3.field_5969, var3.method_23321());
      double var10 = var3.method_23317() - var3.field_6014;
      double var12 = var3.method_24828() ? 0.0 : var3.method_23318() - var3.field_6036;
      double var14 = var3.method_23321() - var3.field_5969;
      if (var3.field_6012 != this.iiIIlIIlll) {
         boolean var16 = var3.field_6012 == this.iiIIlIIlll + 1;
         this.ilIIlIIlll = var16 ? this.iIIIlIIlll : var10;
         this.IiIIlIIlll = var16 ? this.IlIIlIIlll : var12;
         this.liIIlIIlll = var16 ? this.llIIlIIlll : var14;
         this.iIIIlIIlll = var10;
         this.IlIIlIIlll = var12;
         this.llIIlIIlll = var14;
         this.iiIIlIIlll = var3.field_6012;
      }

      double var19 = 1.0 - (double)td;
      class_243 var18 = liIiililiiIiilil.Iilllilliill(var3)
         .method_1031((this.ilIIlIIlll - this.iIIIlIIlll) * var19, (this.IiIIlIIlll - this.IlIIlIIlll) * var19, (this.liIIlIIlll - this.llIIlIIlll) * var19);
      t.liilIIiiliiilIIiil = true;
      t.IlliIIiilllliIIiil = true;
      t.IIIiIIiillIIiIIiil = false;
      if (t.liIiiililiiIiiilil == null
         || t.IIIIIIiillIIIIIiil != var3.field_6012
         || t.IIliiilillIliiilil == null
         || t.IIliiilillIliiilil.field_1352 != var4
         || t.IIliiilillIliiilil.field_1351 != var6
         || t.IIliiilillIliiilil.field_1350 != var8
         || !var18.equals(t.iIliiililIlliiilil)) {
         t.IIliiilillIliiilil = new class_243(var4, var6, var8);
         t.iIliiililIlliiilil = var18;
         t.IIIIIIiillIIIIIiil = var3.field_6012;
         t.liIiiililiiIiiilil = liIiililiiIiilil.lIiiIiIlilli(t.IIliiilillIliiilil, var18, false, 0, null, var3, true, 300);
         this.IIllllIlll(t, 0.0, 0.0, 0.0, false);
         this.lllllillll(t);
      }

      t.Iiliiililliliiilil = "";
      this.liIlliiIll(t, var3, td);
      t.iliiiililIiiiiilil = IlIIilIlllIIilIl.lliiIlliIl & 16777215;
      t.IiIIIIiilliIIIIiil = 0.0;
      t.liIlIIiiliiIlIIiil = 0.0F;
      t.iIllIIiilIlllIIiil = t.liIiiililiiIiiilil.iIilIIiiIlilIIii ? (float)(t.liIiiililiiIiiilil.IlllIIiillllIIii / 20.0) : 0.0F;
      t.lIliIIiiliIliIIiil = Iiiilllliiilll.field_1690.method_31044().method_31034() && !lilIliIiiilIliIi.iiiIlIIIll() && !iIIlIllIlIlIll.IIIllIIliIIl();
      t.llllIIiililllIIiil = var3.method_6068() == class_1306.field_6183 == var3.method_6047().method_31574(class_1802.field_8634) ? -1.0F : 1.0F;
      t.iIIiIIiilIlIiIIiil = t.liIiiililiiIiiilil.iIilIIiiIlilIIii
         && t.liIiiililiiIiiilil.IiIlIIiiliIlIIii.method_1028(var3.method_23317(), var3.method_23318(), var3.method_23321()) > 6.25;
   }

   @Override
   public void Iilililiiili() {
      this.iiiIlIIIll();
   }

   private void lIIlliIIll(lIlIllliIlIlll owner, class_1684 td, class_1297 t, float pearl) {
      owner.liilIIiiliiilIIiil = true;
      owner.IlliIIiilllliIIiil = false;
      owner.lIliIIiiliIliIIiil = false;
      class_243 var5 = td.method_73189();
      class_243 var6 = td.method_18798();
      if (owner.liIiiililiiIiiilil == null || owner.IIliiilillIliiilil != var5 || owner.iIliiililIlliiilil != var6) {
         if (this.IlIllllIll(owner, td, var5)) {
            owner.IIIiIIiillIIiIIiil = true;
         } else {
            owner.IIIiIIiillIIiIIiil = false;
            owner.liIiiililiiIiiilil = liIiililiiIiilil.IilliliilIIi(td, true, 300);
            owner.iIIIIIiilIlIIIIiil = td.field_6012;
            this.IIllllIlll(owner, td.field_6014, td.field_6036, td.field_5969, true);
            this.lllllillll(owner);
         }

         owner.IIliiilillIliiilil = var5;
         owner.iIliiililIlliiilil = var6;
      }

      int var7 = t == null ? -1 : t.method_5628();
      if (var7 != owner.llIIIIiililIIIIiil) {
         owner.llIIIIiililIIIIiil = var7;
         owner.Iiliiililliliiilil = t == null
            ? IliIlllilIi<"IliIlllilIi","qcDbBif9lbgx6Yrt5bvxpEv3f5/+N3gB4aLh807hcPqy">()
            : liIlliIiiiIlliIi.lllllillll(t.method_5477().getString());
      }

      this.liIlliiIll(owner, t, pearl);
      owner.iliiiililIiiiiilil = (
            t == Iiiilllliiilll.field_1724 ? IlIIilIlllIIilIl.lliiIlliIl : (t != null && iIIiIiIlIlIiIiIl.liiiIIllIl(t) ? -8393375 : -1750963)
         )
         & 16777215;
      owner.iIIiIIiilIlIiIIiil = owner.liIiiililiiIiiilil.iIilIIiiIlilIIii && (!(t instanceof class_1309 var8) || var8.method_5805());
      if (owner.IIIiIIiillIIiIIiil) {
         owner.IiIIIIiilliIIIIiil = owner.iiIIIIiilIIlIIIiil;
         owner.liIlIIiiliiIlIIiil = 1.0F;
         owner.iIllIIiilIlllIIiil = 0.0F;
      } else {
         owner.IiIIIIiilliIIIIiil = (double)pearl;
         owner.liIlIIiiliiIlIIiil = owner.liIiiililiiIiiilil.iIilIIiiIlilIIii
            ? IIliiilllIliiill.liiiIIllIl(td.field_6012, pearl, owner.liIiiililiiIiiilil.lIllIIiiiIllIIii)
            : 0.0F;
         owner.iIllIIiilIlllIIiil = owner.liIiiililiiIiiilil.iIilIIiiIlilIIii
            ? IIliiilllIliiill.iIlIlllllill(owner.liIiiililiiIiiilil.lIllIIiiiIllIIii, pearl)
            : 0.0F;
      }
   }

   private void iiiIlIIIll() {
      this.illiIIIlll.clear();
      this.iiliIIIlll.clear();
      this.IIiiIIIlll.clear();
      this.liliIIIlll.clear();
      this.IiliIIIlll.liIiiililiiIiiilil = null;
      this.IiliIIIlll.IIliiilillIliiilil = null;
      this.IiliIIIlll.iIliiililIlliiilil = null;
      this.IiliIIIlll.llliiilililliiilil = null;
      this.IiliIIIlll.IiiIIIiilliiIIIiil = 0.0F;
      this.IiliIIIlll.IlIlIIiilllIlIIiil = 0.0F;
      this.IiliIIIlll.llIiIIiililIiIIiil = false;
      this.iiIIlIIlll = (945811795 - 97) * 1736263375 ^ 1436549038;
      this.IIlIlIIlll = 0L;
   }
}

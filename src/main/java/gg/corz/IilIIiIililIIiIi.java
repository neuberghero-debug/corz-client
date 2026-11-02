package gg.corz;

import com.corz.client.CorzClient;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import net.minecraft.class_1921;
import net.minecraft.class_243;
import net.minecraft.class_2960;
import net.minecraft.class_3532;
import net.minecraft.class_4184;
import net.minecraft.class_4587;
import net.minecraft.class_4588;
import net.minecraft.class_4597;
import net.minecraft.class_9799;
import net.minecraft.class_4597.class_4598;
import org.joml.Matrix4f;

public class IilIIiIililIIiIi extends ilIllIiIll {
   private static final int liIililIIi = 64;
   private static final int iiIililIIi = -670364398;
   private final illlIlIlIillIlIl illililIIi;
   private final IIiiIIIllIiiIIIl IllililIIi = new IIiiIIIllIiiIIIl(
      IliIlllilIi<"IliIlllilIi","Nabpr7vo030btLyS+K+4hGSrzMw4PEPoFbkcbt2mvZI=">(),
      IliIlllilIi<"IliIlllilIi","zWxDeChq+DIiQ8X4JkTl/0mp9acBkaZiz/dosjmJYpj9WHMWP9GhNsIZre5Zys7hdjuFswEPab2hCkYv8Zw=">(),
      IliIlllilIi<"IliIlllilIi","25Cm+x8F7O+d9OW3zqXoCm2q3xi46Frhrcx9lRGmdqle5NoO">()
   );
   private final ililliIiIiilliIi lilililIIi;
   private final iiIiiilIIliiil IIiililIIi;
   private final iiIiiilIIliiil iilililIIi;
   private static final Color lIlililIIi = new Color(
      (-315317433 * 71 - -123 >>> 5 | -315317433 * 71 - -123 << 27) ^ 1716308665,
      -1166929523 - -65 ^ -95 ^ 1166929564,
      ~(-(~861863494) >>> 5 | -(~861863494) << 27) ^ -966457099,
      -(-941644170) - -59 ^ 941644090
   );
   private final iiIiiilIIliiil lIiililIIi;
   private final List<IIliIIIilIliIIIi> iliililIIi;
   private static final Color iIlililIIi = new Color(
      (-1906340061 ^ -31 ^ -3) * -1631000239 ^ -791369393,
      ~(~843323095) - -123 ^ 843323380,
      ~((-383215536 ^ -29) + -87 >>> 31 | (-383215536 ^ -29) + -87 << 1) ^ -766430731,
      -((213249202 >>> 1 | 213249202 << 31) + 115) ^ -106624545
   );
   private final IIIIlilllIIIlill IliililIIi;
   private final IIIIlilllIIIlill lliililIIi;
   private final iiIiiilIIliiil iIiililIIi;
   private class_4598 liiililIIi;
   private static final int IIlililIIi = 620756991;
   private class_9799 IiiililIIi;
   private static final class_2960 IiIililIIi = class_2960.method_60655(
      IliIlllilIi<"IliIlllilIi","J+iLmjOkJXybQiPBZujGy0K2LVW8aQjmgNXp2ERwkFVzs5mUr90=">(),
      IliIlllilIi<"IliIlllilIi","eAGR2UYLMl6eifzXWZI/boOrDAs5HHokKsDZP8QU8/zLZMsohOnOuhxFiLC/T8C254szl6asko81Ug==">()
   );
   private final ililliIiIiilliIi IilililIIi;
   private final ililliIiIiilliIi lllililIIi = new ililliIiIiilliIi(
      IliIlllilIi<"IliIlllilIi","ZzOjgXlJFbtrcY/YVopkoiry5XHIIykm2qV1kycBiDx5OHGC">(),
      IliIlllilIi<"IliIlllilIi","pZolnrBWQoOmqBXnimF/5bZv/z6vR9v8EzYDJqTlSrKThf0XzRIl4vpWA4HHxGcXFPxO/FRz3clNBs8eeBSZuuPrAx8=">(),
      IliIlllilIi<"IliIlllilIi","xUaiopM6fmgDSV06AmECBSYgYtl3pxJAm10Mq8S5yw==">(),
      this::iiiIlIIIll
   );

   @Override
   protected void lilIliilIl(IiiIlllliiIlll e) {
      if (this.IliIlllilIi() && e.liiiIIllIl() == (~(-892031095 * 270549121) ^ 500255735)) {
         if (Iiiilllliiilll.field_1724 != null && Iiiilllliiilll.field_1755 == null) {
            if (this.illililIIi.IiIiliIiiiIi(e.IliIlllilIi())) {
               this.iiiIlIIIll();
            }
         }
      }
   }

   @Override
   public void iIiIlIliIl(JsonElement element) {
      if (element != null && element.isJsonObject()) {
         JsonObject var2 = element.getAsJsonObject();
         if (var2.has(IliIlllilIi<"IliIlllilIi","RSLieHPoyyon7LL71OTe2nKVvn/45HhHxjdLpuo4XaLYUltbBw==">())
            && var2.get(IliIlllilIi<"IliIlllilIi","RSLieHPoyyon7LL71OTe2nKVvn/45HhHxjdLpuo4XaLYUltbBw==">()).isJsonArray()) {
            this.iliililIIi.clear();

            for (JsonElement var4 : var2.getAsJsonArray(IliIlllilIi<"IliIlllilIi","RSLieHPoyyon7LL71OTe2nKVvn/45HhHxjdLpuo4XaLYUltbBw==">())) {
               if (var4.isJsonObject()) {
                  JsonObject var5 = var4.getAsJsonObject();

                  try {
                     this.iliililIIi
                        .add(
                           new IIliIIIilIliIIIi(
                              var5.get(IliIlllilIi<"IliIlllilIi","e+k8lhV5tFF5UxVM/WtSPwMhfR/VXbRMOU2ZXBM=">()).getAsDouble(),
                              var5.get(IliIlllilIi<"IliIlllilIi","+1ZrWzUTA/oYk7zkS7Ao6ZVzh+zkRyIONeuf/+w=">()).getAsDouble(),
                              var5.get(IliIlllilIi<"IliIlllilIi","cpvCoFoT45m9DEarZ+Q7Ufb/HR9DcHA3lageRrs=">()).getAsDouble(),
                              var5.has(IliIlllilIi<"IliIlllilIi","OqdElavjOrVSgM68JMR904S2r0H3c37ROZRQCkprYkA=">())
                                 ? var5.get(IliIlllilIi<"IliIlllilIi","OqdElavjOrVSgM68JMR904S2r0H3c37ROZRQCkprYkA=">()).getAsString()
                                 : IliIlllilIi<"IliIlllilIi","rpKPK7+ubwIUj+bEObsTHSe1O2zeT/cxmeQpJjCm">(),
                              var5.has(IliIlllilIi<"IliIlllilIi","gs6QICl0JZVKZcts1+wmkB2kcjv6RuZAD3hdXLXkzhbY">())
                                 ? var5.get(IliIlllilIi<"IliIlllilIi","gs6QICl0JZVKZcts1+wmkB2kcjv6RuZAD3hdXLXkzhbY">()).getAsInt() & 16777215
                                 : '\uaaff'
                           )
                        );
                     if (this.iliililIIi.size() >= 64) {
                        break;
                     }
                  } catch (Exception var7) {
                  }
               }
            }
         }
      }
   }

   @Override
   public void Iilililiiili() {
      if (this.IiiililIIi != null) {
         this.IiiililIIi.close();
         this.IiiililIIi = null;
         this.liiililIIi = null;
      }
   }

   private void IlIllllIll() {
      long var2 = 1529896411761203855L;
      if (!this.iliililIIi.isEmpty()) {
         var2 ^= ((long)this.iliililIIi.size() << 32 ^ var2) & -1L << 32;
         this.iliililIIi.clear();
         Iliiiiilliiiii.IliIlllilIi()
            .iIlIlllllill(
               IliIlllilIi<"IliIlllilIi","Fa33BcOF3Z88acQ/TRuG5tHrh4L0ZXsnIdeFGMWOd/U20Z+8VcFrwQBPWwKu">(),
               (int)(var2 >>> 32) + IliIlllilIi<"IliIlllilIi","XB5EY3HXEcDMwEBn4k3CsVcKURcGSK0+U3sPOh0SLeMim3zH">(),
               false
            );
         iiiIIIlIIIlIIl.liiiIIllIl();
      }
   }

   @Override
   public void IIiilIiiiIii(illlllIillll event) {
      if (this.IliIlllilIi() && Iiiilllliiilll.field_1724 != null && Iiiilllliiilll.field_1687 != null && !this.iliililIIi.isEmpty()) {
         class_4184 var2 = Iiiilllliiilll.field_1773.method_19418();
         class_243 var3 = var2.method_71156();
         long var4 = System.currentTimeMillis();
         float var6 = 0.85F + 0.15F * (float)Math.sin((double)((float)(var4 % 10000L) / 1000.0F * 3.0F));
         Matrix4f var7 = event.IliiiIIilliiiIIi.method_23760().method_23761();
         if (this.iilililIIi.Iilllilliill()) {
            float var8 = (float)this.lliililIIi.Iilllilliill();
            class_4588 var9 = iIiiIIilIliiIIil.IilliliilIIi();

            for (IIliIIIilIliIIIi var11 : this.iliililIIi) {
               float var12 = (float)(var11.illiiIliil - var3.field_1352);
               float var13 = (float)(var11.liliiIliil - var3.field_1350);
               float var14 = (float)(var11.IiliiIliil - var3.field_1351);
               double var15 = Math.sqrt((double)(var12 * var12 + var13 * var13));
               float var17 = var15 > 0.001 ? (float)((double)var13 / var15) : 1.0F;
               float var18 = var15 > 0.001 ? (float)((double)(-var12) / var15) : 0.0F;
               float var19 = 0.12F;
               int var20 = iIillliIlillli.IIIilIIiiIIi(var11.IIiiiIliil, 0.55F * var6);
               int var21 = iIillliIlillli.IIIilIIiiIIi(var11.IIiiiIliil, 0.0F);
               iIiiIIilIliiIIil.IlIlllIlilIl(
                  var9,
                  var7,
                  var12 + var17 * var19,
                  var14,
                  var13 + var18 * var19,
                  var20,
                  var12 - var17 * var19,
                  var14,
                  var13 - var18 * var19,
                  var20,
                  var12 - var17 * var19,
                  var14 + var8,
                  var13 - var18 * var19,
                  var21,
                  var12 + var17 * var19,
                  var14 + var8,
                  var13 + var18 * var19,
                  var21
               );
            }
         }

         if (this.IIiililIIi.Iilllilliill()) {
            if (this.IiiililIIi == null) {
               this.IiiililIIi = new class_9799(524288);
               this.liiililIIi = class_4597.method_22991(this.IiiililIIi);
            }

            class_1921 var22 = llIlliIlilIlliIl.lililiiIll.apply(IiIililIIi);
            class_4588 var23 = this.liiililIIi.method_73477(var22);
            float var24 = (float)this.IliililIIi.Iilllilliill() * var6;
            class_4587 var25 = event.IliiiIIilliiiIIi;

            for (IIliIIIilIliIIIi var27 : this.iliililIIi) {
               int var28 = var27.IIiiiIliil >> 16 & 0xFF;
               int var29 = var27.IIiiiIliil >> 8 & 0xFF;
               int var16 = var27.IIiiiIliil & 0xFF;
               int var30 = (int)(255.0F * var6);
               var25.method_22903();
               var25.method_22904(var27.illiiIliil - var3.field_1352, var27.IiliiIliil - var3.field_1351 + 1.2, var27.liliiIliil - var3.field_1350);
               var25.method_22907(var2.method_23767());
               var25.method_22905(var24, var24, 1.0F);
               Matrix4f var31 = var25.method_23760().method_23761();
               var23.method_22918(var31, -1.0F, -1.0F, 0.0F).method_22913(0.0F, 1.0F).method_1336(var28, var29, var16, var30);
               var23.method_22918(var31, 1.0F, -1.0F, 0.0F).method_22913(1.0F, 1.0F).method_1336(var28, var29, var16, var30);
               var23.method_22918(var31, 1.0F, 1.0F, 0.0F).method_22913(1.0F, 0.0F).method_1336(var28, var29, var16, var30);
               var23.method_22918(var31, -1.0F, 1.0F, 0.0F).method_22913(0.0F, 0.0F).method_1336(var28, var29, var16, var30);
               var25.method_22909();
            }

            this.liiililIIi.method_22993();
         }
      }
   }

   private void iiiIlIIIll() {
      if (Iiiilllliiilll.field_1724 != null) {
         if (this.iliililIIi.size() >= 64) {
            Iliiiiilliiiii.IliIlllilIi()
               .iIlIlllllill(
                  IliIlllilIi<"IliIlllilIi","wQNdq1euqmjH//ls9gRBP5mdYSM3ryal42yluZDxhc+y5Yvabg==">(),
                  IliIlllilIi<"IliIlllilIi","n5s74SzbTMTk937Uf4O1SHM6wdloPdhLsaOef36sCX/UU77wp4f4Fa4qz66EP9k=">(),
                  false
               );
         } else {
            class_243 var1 = Iiiilllliiilll.field_1724.method_73189();
            String var2 = this.IllililIIi.Iilllilliill() != null && !this.IllililIIi.Iilllilliill().isBlank()
               ? this.IllililIIi.Iilllilliill().trim()
               : IliIlllilIi<"IliIlllilIi","rpKPK7+ubwIUj+bEObsTHSe1O2zeT/cxmeQpJjCm">() + (this.iliililIIi.size() + 1);
            int var3 = Color.HSBtoRGB((float)this.iliililIIi.size() * 0.37F % 1.0F, 0.85F, 1.0F) & 16777215;
            this.iliililIIi.add(new IIliIIIilIliIIIi(var1.field_1352, var1.field_1351, var1.field_1350, var2, var3));
            Iliiiiilliiiii.IliIlllilIi()
               .iIlIlllllill(
                  IliIlllilIi<"IliIlllilIi","3q3IgUmPKHdzmXkRUS9/bx7zSvczgkotnVGm/LBog6AdP4jOKDkzTKjZ">(),
                  String.format(
                     IliIlllilIi<"IliIlllilIi","fu4zZnHFz2lXl87BprJeYNco9UvbJuTZVRhdz51vpvxKqofqEbMF5lrpherHRQ==">(),
                     var2,
                     var1.field_1352,
                     var1.field_1351,
                     var1.field_1350
                  ),
                  true
               );
            iiiIIIlIIIlIIl.liiiIIllIl();
         }
      }
   }

   private void lIIlliIIll() {
      if (Iiiilllliiilll.field_1724 != null && !this.iliililIIi.isEmpty()) {
         class_243 var1 = Iiiilllliiilll.field_1724.method_73189();
         int var2 = -1;
         double var3 = Double.MAX_VALUE;

         for (int var5 = 0; var5 < this.iliililIIi.size(); var5++) {
            double var6 = var1.method_1025(this.iliililIIi.get(var5).IliIlllilIi());
            if (var6 < var3) {
               var3 = var6;
               var2 = var5;
            }
         }

         if (var2 >= 0) {
            IIliIIIilIliIIIi var8 = this.iliililIIi.remove(var2);
            Iliiiiilliiiii.IliIlllilIi()
               .iIlIlllllill(IliIlllilIi<"IliIlllilIi","Ag6pJlFgZVqXBpDUQdUn7UDsQhVJd3NOR796EfNhDWLTIAG+n11/gx4VzVs=">(), var8.iiliiIliil, false);
            iiiIIIlIIIlIIl.liiiIIllIl();
         }
      }
   }

   private static float ilIllIiIll(float v, float hi, float lo) {
      return v < hi ? hi : Math.min(v, lo);
   }

   public IilIIiIililIIiIi() {
      super(IliIlllilIi<"IliIlllilIi","wQNdq1euqmjH//ls9gRBP5mdYSM3ryal42yluZDxhc+y5Yvabg==">(), lllIllillIll.llIlIIIiilIlIIIi);
      this.illililIIi = new illlIlIlIillIlIl(
         IliIlllilIi<"IliIlllilIi","6W/0HV0Vj3iNJXy/sms/UaIZiMqfAx+w2Xs3nDJVk1hx6DUlfKVlyk6f8QY=">(),
         IliIlllilIi<"IliIlllilIi","ulF22VK2zYaVPqf7Tw3EMtgCfRNd+9PoS2iga/yl/R4GTWWtl/N15KudmSCu/60HLhlFlKqWIHhQXm3TL5xmsKTntDlSJo5nwFOzLfcMqLTlPYxYUVk=">()
      );
      this.IilililIIi = new ililliIiIiilliIi(
            IliIlllilIi<"IliIlllilIi","Y309oJbE6gzeyNIpt8dgBezQ0/Pa683MrEPaBFJrNy2/HlWYGPblzlqP">(),
            IliIlllilIi<"IliIlllilIi","gLmXm/xKnZeklbIhUu5yWVUhFK3SuqBVg187fmN/UTSBpU0vwhA7NWYwPnZJ7xmJZ2Nbef4lufRczN6FqzE=">(),
            IliIlllilIi<"IliIlllilIi","3hkuNhWaxCNIyO2gl8zwttZnF4aq+mYC1+fSN8OdIogXPw==">(),
            this::lIIlliIIll
         )
         .Ililllililil();
      this.lilililIIi = new ililliIiIiilliIi(
            IliIlllilIi<"IliIlllilIi","dLl1SJhw3lNiyDrhMUz6/CCgsftnaA3eq4Oe3fY/Dkc6W8lzdQ==">(),
            IliIlllilIi<"IliIlllilIi","3GsrBbnZjxsy4emKjVaUh+P1Qyc7YaCtzh0skccVIY5x7SDcx3g2pyDci4aGEZjRgQ==">(),
            IliIlllilIi<"IliIlllilIi","dbO7J3mAjFMlrly/PipqpXujkcR2jBje8yhAFKUXYiCy">(),
            this::IlIllllIll
         )
         .Ililllililil();
      this.iilililIIi = new iiIiiilIIliiil(
         IliIlllilIi<"IliIlllilIi","OjhnzrHpv+DzBp0Pmgx4lV4HcORvSZO7lO0RkRlWVEY=">(),
         IliIlllilIi<"IliIlllilIi","qZUcelvkUp5uSXtptjTf9XrWRMOSb4nt9POxuUveRfsU5zUzO/zirnd+RsWaUQkw3PDGiboTCg==">(),
         true
      );
      this.IIiililIIi = new iiIiiilIIliiil(
         IliIlllilIi<"IliIlllilIi","sMFbAoKqXl+bNrkKnQcD4D2gI7fGXr16ZRrCuLBvlI8=">(),
         IliIlllilIi<"IliIlllilIi","NCT57f0gtrDqZ9bu2ga2wpGcEUaBckEqienHzIsmJe0x8yJLq5QNuJcmXwNRaNeo5F9zYRuMQfr/PQGp">(),
         true
      );
      this.lIiililIIi = new iiIiiilIIliiil(
         IliIlllilIi<"IliIlllilIi","wNgavAVUz5ulhOrrzgaEXTP5JGXY7RezncsdpYbEF2eN">(),
         IliIlllilIi<"IliIlllilIi","gQsKT3bZNd93bdpr7rLwLnDrv4Rq0zXi5uNe30LLdBYIZhFpAR9b0sFMqvEw2S6uwtE9TBi8/J9myA==">(),
         true
      );
      this.iIiililIIi = new iiIiiilIIliiil(
         IliIlllilIi<"IliIlllilIi","xJQMLdMHwbZ1xBaTJ/htQWqezYkAJmGfTQQrNilJliu0MaAGzJ9HF839">(),
         IliIlllilIi<"IliIlllilIi","cTQjU46QSlxQFO1bYY7Trhp56EV2xOGKUH0VfloIc2Vjfoyt9AxFFXtUzs6Qz4boKdeUTEtpk3pszKqIZpmw6kMzrjd0qHO5e5w16w==">(),
         true
      );
      this.IliililIIi = new IIIIlilllIIIlill(
         IliIlllilIi<"IliIlllilIi","IOwdTGUb3keULsR5C0Imswig4KhMV1gHkmpzZS+yoFr9M6dMxA==">(),
         IliIlllilIi<"IliIlllilIi","zURpnqFjTCScy+HozQx34/s4xj+QHtDhGODTlO36uRXnkRJ0A07oFrMr60yRwdRVCZJwFefM">(),
         0.9,
         0.3,
         3.0,
         0.1
      );
      this.lliililIIi = new IIIIlilllIIIlill(
         IliIlllilIi<"IliIlllilIi","lkz74mlM4A0k3r7oy5prdvnkee8wAXyeLl6WXZtqUXnFzF4UPRm6">(),
         IliIlllilIi<"IliIlllilIi","AOPMukizXFD1AhYoiDfspiA0ixqt8h8kOy1hvUUzbGbCKBlmCG/Q815HbCsSZ+VeZeSwVvsY39obqpSr3GU=">(),
         40.0,
         4.0,
         128.0,
         1.0
      );
      this.iliililIIi = new ArrayList<>();
      this.IlIlllIlilIl(
         new IilliIllilliIl[]{
            this.IllililIIi,
            this.lllililIIi,
            this.illililIIi,
            this.IilililIIi,
            this.lilililIIi,
            this.iilililIIi,
            this.IIiililIIi,
            this.lIiililIIi,
            this.iIiililIIi,
            this.IliililIIi,
            this.lliililIIi
         }
      );
   }

   @Override
   public JsonElement IIiIllIiIl() {
      JsonObject var1 = new JsonObject();
      JsonArray var2 = new JsonArray();

      for (IIliIIIilIliIIIi var4 : this.iliililIIi) {
         JsonObject var5 = new JsonObject();
         var5.addProperty(IliIlllilIi<"IliIlllilIi","e+k8lhV5tFF5UxVM/WtSPwMhfR/VXbRMOU2ZXBM=">(), var4.illiiIliil);
         var5.addProperty(IliIlllilIi<"IliIlllilIi","+1ZrWzUTA/oYk7zkS7Ao6ZVzh+zkRyIONeuf/+w=">(), var4.IiliiIliil);
         var5.addProperty(IliIlllilIi<"IliIlllilIi","cpvCoFoT45m9DEarZ+Q7Ufb/HR9DcHA3lageRrs=">(), var4.liliiIliil);
         var5.addProperty(IliIlllilIi<"IliIlllilIi","OqdElavjOrVSgM68JMR904S2r0H3c37ROZRQCkprYkA=">(), var4.iiliiIliil);
         var5.addProperty(IliIlllilIi<"IliIlllilIi","gs6QICl0JZVKZcts1+wmkB2kcjv6RuZAD3hdXLXkzhbY">(), var4.IIiiiIliil);
         var2.add(var5);
      }

      var1.add(IliIlllilIi<"IliIlllilIi","RSLieHPoyyon7LL71OTe2nKVvn/45HhHxjdLpuo4XaLYUltbBw==">(), var2);
      return var1;
   }

   @Override
   public void Iliilliiilii(lIiIlliiIiIlli event) {
      if (this.IliIlllilIi() && Iiiilllliiilll.field_1724 != null && Iiiilllliiilll.field_1687 != null && !this.iliililIIi.isEmpty()) {
         if (this.lIiililIIi.Iilllilliill() && Iiiilllliiilll.field_1755 == null) {
            class_243 var2 = Iiiilllliiilll.field_1773.method_19418().method_71156();
            int var3 = Iiiilllliiilll.method_22683().method_4486();
            int var4 = Iiiilllliiilll.method_22683().method_4502();
            float var5 = (float)Math.toRadians((double)Iiiilllliiilll.field_1773.method_19418().method_19330());
            float var6 = (float)Math.toRadians((double)Iiiilllliiilll.field_1773.method_19418().method_19329());
            float var7 = (float)Math.toRadians((double)IiilIIiliilIIi.liiiIIllIl());
            float var8 = var7 * ((float)var3 / (float)var4);
            float var9 = 18.0F;
            float var10 = (float)var3 / 2.0F - var9;
            float var11 = (float)var4 / 2.0F - var9;
            class_4587 var12 = new class_4587();
            CorzClient.fontManager.iIlIlllllill(var12);
            IIIiiIillIIiiIil.IliIlllilIi(var12);
            IIliiIlllIliiIll var13 = CorzClient.fontManager.lIiiIiIlilli();
            int var14 = Math.round(var13.IilliliilIIi());

            for (IIliIIIilIliIIIi var16 : this.iliililIIi) {
               double var17 = var2.method_1022(var16.IliIlllilIi());
               class_243 var19 = new class_243(var16.illiiIliil, var16.IiliiIliil + 1.2, var16.liliiIliil);
               class_243 var20 = llilllililll.iIlIlllllill(var19);
               boolean var21 = var20 != null && var20.field_1350 > 0.0 && var20.field_1350 < 1.0;
               float var22;
               float var23;
               if (var21
                  && var20.field_1352 >= (double)var9
                  && var20.field_1352 <= (double)((float)var3 - var9)
                  && var20.field_1351 >= (double)var9
                  && var20.field_1351 <= (double)((float)var4 - var9)) {
                  var22 = (float)var20.field_1352;
                  var23 = (float)var20.field_1351;
               } else {
                  if (!this.iIiililIIi.Iilllilliill()) {
                     continue;
                  }

                  double var24;
                  double var26;
                  if (var21) {
                     var24 = var20.field_1352 - (double)var3 / 2.0;
                     var26 = var20.field_1351 - (double)var4 / 2.0;
                  } else {
                     double var28 = var19.field_1352 - var2.field_1352;
                     double var30 = var19.field_1351 - var2.field_1351;
                     double var32 = var19.field_1350 - var2.field_1350;
                     double var34 = Math.sqrt(var28 * var28 + var32 * var32);
                     double var36 = class_3532.method_15338(Math.toDegrees(Math.atan2(-var28, var32)) - Math.toDegrees((double)var5)) * Math.PI / 180.0;
                     double var38 = -Math.atan2(var30, var34) - (double)var6;
                     boolean var40 = Math.abs(var36) < Math.PI / 2;
                     var24 = (var40 ? var36 / ((double)var8 / 2.0) : (var36 >= 0.0 ? 1.0 : -1.0)) * (double)var10;
                     var26 = var38 / ((double)var7 / 2.0) * (double)var11;
                  }

                  double var43 = Math.max(Math.abs(var24) / (double)var10, Math.abs(var26) / (double)var11);
                  if (var43 < 0.001) {
                     continue;
                  }

                  var22 = (float)((double)((float)var3 / 2.0F) + var24 / var43);
                  var23 = (float)((double)((float)var4 / 2.0F) + var26 / var43);
               }

               String var41 = (int)var17 + IliIlllilIi<"IliIlllilIi","J1Sy9i2ZaKSzkmNzt3LTNw8x+l4ufkSoA8Q9waI=">();
               byte var25 = 7;
               byte var42 = 5;
               byte var27 = 5;
               byte var44 = 5;
               int var29 = Math.round(var13.iIlIlllllill(var16.iiliiIliil));
               int var45 = Math.round(var13.iIlIlllllill(var41));
               int var31 = var25 + var42 + var27 + var29 + var44 + var45 + var25;
               int var46 = var14 + 8;
               int var33 = var46 / 2;
               int var47 = Math.round(ilIllIiIll(var22 - (float)var31 / 2.0F, 2.0F, (float)(var3 - var31) - 2.0F));
               int var35 = Math.round(ilIllIiIll(var23 - (float)var46 / 2.0F, 2.0F, (float)(var4 - var46) - 2.0F));
               IIIiiIillIIiiIil.lIiiIiIlilli(event.IIiIilIIIl, var47 - 1, var35 - 1, var31 + 2, var46 + 2, var33 + 1, 620756991);
               IIIiiIillIIiiIil.lIiiIiIlilli(event.IIiIilIIIl, var47, var35, var31, var46, var33, -670364398);
               IIIiiIillIIiiIil.lIiiIiIlilli(
                  event.IIiIilIIIl, var47 + var25, var35 + (var46 - var42) / 2, var42, var42, 2, 0xFF000000 | var16.IIiiiIliil & 16777215
               );
               int var48 = var47 + var25 + var42 + var27;
               int var37 = var13.IlIillIiilIi(var35, var46);
               var13.IliIlllilIi(var16.iiliiIliil, (float)var48, (float)var37, lIlililIIi);
               var13.IliIlllilIi(var41, (float)(var48 + var29 + var44), (float)var37, iIlililIIi);
            }
         }
      }
   }
}

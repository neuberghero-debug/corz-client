package gg.corz;

import net.minecraft.class_1268;
import net.minecraft.class_1802;
import net.minecraft.class_1819;
import net.minecraft.class_2246;
import net.minecraft.class_2338;
import net.minecraft.class_243;
import net.minecraft.class_2561;
import net.minecraft.class_2680;
import net.minecraft.class_2885;
import net.minecraft.class_3959;
import net.minecraft.class_3965;
import net.minecraft.class_4969;
import net.minecraft.class_9334;
import net.minecraft.class_239.class_240;
import net.minecraft.class_3959.class_242;
import net.minecraft.class_3959.class_3960;
import org.lwjgl.glfw.GLFW;

public class iIIliIiIlIliIi extends ilIllIiIll implements liliIiliiliIil {
   private final iilliIlIIiliIl llllIiliiilllIilii;
   private class_2338 ililIiliiIiilIilii;
   private int IlilIiliillilIilii;
   private int lIilIiliiiIilIilii;
   private final iilliIlIIiliIl IlIlIiliillIlIilii;
   private int lIliIiliiiIliIilii;
   private final iilliIlIIiliIl iiiIIiliiIIIlIilii;
   private int iIIiIiliiIlIiIilii;
   private final iilliIlIIiliIl iIllIiliiIlllIilii;
   private static final int IillIiliilillIilii = 10;
   private final iiIlIiIiIIllIiIi IlliIiliillliIilii;
   private final iiIiiilIIliiil ilIlIiliiIiIlIilii;
   private int llIiIiliiilIiIilii;
   private int IIIiIiliilIIiIilii;
   private final iiIiiilIIliiil IIllIiliilIllIilii;
   private final iiIiiilIIliiil liIlIiliiiiIlIilii;
   private long IiIiIiliiliIiIilii;
   private int liilIiliiiiilIilii;
   private final iilliIlIIiliIl IiiIIiliiliiIIilii = new iilliIlIIiliIl(
      IliIlllilIi<"IliIlllilIi","9j1G8bJCBuwbAR7i4BRv86Tn49/x0RpWUfLXV8zikUt9Auc1Epou9g==">(),
      IliIlllilIi<"IliIlllilIi","7rTMyKXKqXbWSQiL2FeDHkPcRuJrpK/Ll1nQhZgDKkqMStO4EWnlDt7BL+DeHm+rkrPkdQbxxBApCPqd40lf4A==">(),
      0,
      0,
      20
   );
   private boolean iiIiIiliiIIliIilii;
   private final iilliIlIIiliIl lIIlIiliiiIIlIilii;
   private int iillIiliiIIilIilii;

   @Override
   protected void llIIlilIIl(IiIiIlIiliIiIlIi event) {
      if (Iiiilllliiilll.field_1724 != null && Iiiilllliiilll.method_18854()) {
         if (event.lIiilIIIIi instanceof class_2885 && !event.lIiiIiIlilli()) {
            iiilIiIIIiIi.liiiIIllIl(IIllIIlilIllIIli.IlIlllIlilIl());
         }
      }
   }

   private void iIIilIlIil(String msg) {
      if (IliiliIllliiliIl.iiiIlIIIll()) {
         Iliiiiilliiiii.IliIlllilIi().iIlIlllllill(IliIlllilIi<"IliIlllilIi","oP2jA6f7FSopgMmESE2kMtNCY2fjhkhmaMuomuXF5OA16NJ6II+F">(), msg, false);
      } else if (Iiiilllliiilll.field_1724 != null) {
         Iiiilllliiilll.field_1724
            .method_7353(
               class_2561.method_43470(IliIlllilIi<"IliIlllilIi","QIQctgTEfnYJL8Fwgyq6KY78holqdzA38asT1Bl271ZglPe8/Q4Pbt/kwKAO+g+bWQ==">() + msg), false
            );
      }
   }

   private void IIiillIiil(class_2338 pos, int charge) {
      this.ililIiliiIiilIilii = pos;
      this.liilIiliiiiilIilii = charge;
      this.IIIiIiliilIIiIilii = 0;
   }

   @Override
   protected void IiIIlliIIl(IliIliIllliIliIl event) {
   }

   public iIIliIiIlIliIi() {
      super(IliIlllilIi<"IliIlllilIi","UBB0eNq/6Re/dBWwd9DMBpBVL68GAR55oBSwkAM4k42XZVczZOWFqQ==">(), lllIllillIll.liiIIIIiiiiIIIIi);
      this.iiiIIiliiIIIlIilii = new iilliIlIIiliIl(
         IliIlllilIi<"IliIlllilIi","Db7Tz/zHJjNMspgEp12QgguEdNgBebZ6Xfnq3eaFRseIpMhlcfheYJxg1A==">(),
         IliIlllilIi<"IliIlllilIi","+U3QwbtfaeWomYswGrPn4ZGjiv/cqmLzD0kSFLMzdqL57sJucAUPESOQhm7bGkp/SINapRGJfiVtmmFKe2Zx85/I">(),
         0,
         0,
         20
      );
      this.lIIlIiliiiIIlIilii = new iilliIlIIiliIl(
         IliIlllilIi<"IliIlllilIi","DxMNtaZSuQzaAopeDx8oswUBSiT+Naa9DHEABkwwep8Kq3ng9mVwr9I=">(),
         IliIlllilIi<"IliIlllilIi","bj6/1s3tTpFInTEXm5NhMoxL9JPuSBR+M1z9ztd/iuJHhDKLn0WVkepOD6exYD42t/tilG9BG6PPeWyFzpbRB/U=">(),
         0,
         0,
         20
      );
      this.IlIlIiliillIlIilii = new iilliIlIIiliIl(
         IliIlllilIi<"IliIlllilIi","mDb5PXBmEyE/V4b4a59XPKqiBpadldmnrhDmRLFYLaVnYvT0cbM=">(),
         IliIlllilIi<"IliIlllilIi","9Cxfp/MKPkDnnsU/VT535Gwut8T3K0AtEHUi69q/APhjPDIDahLuVl4gPRTxoxvOpQqhIL5dEw==">(),
         1,
         1,
         9
      );
      this.ilIlIiliiIiIlIilii = new iiIiiilIIliiil(
         IliIlllilIi<"IliIlllilIi","5vGLFyQRThn/Bu2CGyHx3P2wc/5DglGt9P/JLbkaliVJGeWpkaD9NgLka87a0MI=">(),
         IliIlllilIi<"IliIlllilIi","zGbxDOn8iGKF0K5au2Hxrs0TVUOe2SodNZPodkcQtle9g4QqaeZrQBRJcO1DYvoUoNVU6Vlr7PCTV8CP3WVn9r+YfiFmQz12E1BGeUX5OCwLmKO7dQ1SucrnBTHTxx5qq6tzSnc/kLKlZhneBAh7t09+nwsqtix42ao3x7U248TdlpnO+1a0rM1FkYEqcQuTCrsxTFSAE3Hx5CeurME4lqTx+yffk5vK4ECPVQauwThKxfl+B0weWvhOPKT7qyVYrW8bYDukbze59GzjRLN6ivYD3qmAjLk=">(),
         true
      );
      this.liIlIiliiiiIlIilii = new iiIiiilIIliiil(
         IliIlllilIi<"IliIlllilIi","zQ8WhuVjQdl9oAaXfIWsLPJJg4MceZwSpjYuryfiPe9jXqh++FJLAA==">(),
         IliIlllilIi<"IliIlllilIi","Vk8mL1b//eCuR8n/yOzB2ULkJxgL1q+v9ASncsCiAOpS5lVVfreNFgxOQstrjfruNjR7ENwqjvg3sMHAoCHQFy605PDArJo9+FfAwCWQUuAGNqq/WxDNCeKlZdig2It23A9msFHM8POgi3yyq9q5Xu0kIZ9sCsDlivJPgiVhcHhBGuVmliRyher0giQMKdnToO0EGDC12ri5nxY=">(),
         false
      );
      this.IIllIiliilIllIilii = new iiIiiilIIliiil(
         IliIlllilIi<"IliIlllilIi","F7Owd+MtdyQ9o1riDy4bfmkd7Gu+3DZWPcSUGb87iW+BAVIiCZ3KVTcl">(),
         IliIlllilIi<"IliIlllilIi","G52IN6Z1EmFSSOH6pTlD36f8kDtBC8iKZ5WcCujihG1TKdkD6QCDIXRSora0/aqzA9JqM5fFl7gdnA/iVd5ng9Uk1Ge8KC338uC8qHWbXXT3tJxlVv0R5DLZP4e9eJjec4txNcLAFcILlWtfvkAp8gaEq4ILmGD9j7m2OzrB4gjyh2utqh61857fKh36HpNFZJZ6FWuz6LuXFbyxkLG1v72rV0wc0p554zLYs4os8z+zUdk=">(),
         true
      );
      this.iIllIiliiIlllIilii = new iilliIlIIiliIl(
         IliIlllilIi<"IliIlllilIi","tOX8nOvKKFQuHShjiGhtL2Ma1aQLTeK0yMWf6aQ3LGosYKjU+zTG">(),
         IliIlllilIi<"IliIlllilIi","s4mj6OOcQF9M2m4Y0qijiuEsOaFqO/Av2r/q7j7UdBMKbkV/ujlaIwwaAFVHs45aGbusBLyMwjjl5Ap2riMzeGiJFxEp+z+/vpRrD69xkUEAveCg6YXddOFm04i/Y+cIOXwZY8pDOfDb6cxKZMcWIoYgBThwzanJYcnFeVt2hSK29dlvQw==">(),
         80,
         0,
         90
      );
      this.llllIiliiilllIilii = new iilliIlIIiliIl(
         IliIlllilIi<"IliIlllilIi","529HF4ff4CC3RFgz2OM5P9V8Ytlx42aWAtyXUX4y+z+ejtHEl23u8xuP">(),
         IliIlllilIi<"IliIlllilIi","JaSyykqnPdbWaPRhE0kG7llzQ3q5Yz+TsOJXsdkihekCYvXaL+r6u8VvnkYJRonv2cSH32Cu79pK98Z23OsghRP+shOYKq68MFquYi8fSaLia0syqzI3W3ZdnRdW+HN8mWnz6Q91v1/wyVhaUY/WHHAQudyKk2khZ8CzDKcbLycxgA==">(),
         10,
         0,
         60
      );
      this.liilIiliiiiilIilii = -1;
      this.llIiIiliiilIiIilii = -1;
      this.lIliIiliiiIliIilii = Integer.MIN_VALUE;
      this.IlliIiliillliIilii = new iiIlIiIiIIllIiIi();
      this.IlIlllIlilIl(
         new IilliIllilliIl[]{
            this.IiiIIiliiliiIIilii,
            this.iiiIIiliiIIIlIilii,
            this.lIIlIiliiiIIlIilii,
            this.IlIlIiliillIlIilii,
            this.ilIlIiliiIiIlIilii,
            this.liIlIiliiiiIlIilii,
            this.IIllIiliilIllIilii,
            this.iIllIiliiIlllIilii,
            this.llllIiliiilllIilii
         }
      );
   }

   @Override
   public void Iilililiiili() {
      this.lliililiil();
   }

   @Override
   public void iIIIlIlIIl() {
      if (Iiiilllliiilll.field_1724 != null && Iiiilllliiilll.field_1687 != null && Iiiilllliiilll.field_1761 != null) {
         this.lIliliIlil();
         this.lililiilil();
         if (!this.iIlllIllll()) {
            this.IlliIiliillliIilii.lIiiIiIlilli();
         }

         if (Iiiilllliiilll.field_1755 == null && !this.IIllllIlll() && this.iIlllIllll()) {
            this.Iillllilll();
         } else {
            this.iIiilIliil();
         }
      } else {
         this.iIiilIliil();
         this.illilIilil();
         this.iiIiIiliiIIliIilii = false;
      }
   }

   private boolean IiIilliIil(class_2338 pos) {
      int var2 = this.IlIlIiliillIlIilii.Iilllilliill() - 1;
      if (Iiiilllliiilll.field_1724.method_31548().method_67532() != var2) {
         if (this.iillIiliiIIilIilii < this.IiiIIiliiliiIIilii.Iilllilliill()) {
            this.iillIiliiIIilIilii++;
            return false;
         }

         this.iillIiliiIIilIilii = 0;
         Iiiilllliiilll.field_1724.method_31548().method_61496(var2);
      }

      if (this.IlilIiliillilIilii < this.lIIlIiliiiIIlIilii.Iilllilliill()) {
         this.IlilIiliillilIilii++;
         return false;
      } else {
         boolean var3 = Iiiilllliiilll.field_1724.method_6047().method_31574(class_1802.field_8801)
            || Iiiilllliiilll.field_1724.method_6079().method_31574(class_1802.field_8801);
         if (var3 && (Integer)Iiiilllliiilll.field_1687.method_8320(pos).method_11654(class_4969.field_23153) < 4) {
            return false;
         } else if (this.liilliiill(pos) && this.IIIillIIil(pos, IliIlllilIi<"IliIlllilIi","VcoxpVx++qoJ3GZN9lR8FEfCQvU9+DRTRJRh8p2s81Bmk5Ta">())) {
            this.IlilIiliillilIilii = 0;
            return true;
         } else {
            return false;
         }
      }
   }

   private void illilIilil() {
      this.iIIiIiliiIlIiIilii = 0;
      this.llIiIiliiilIiIilii = -1;
   }

   private void iIiilIliil() {
      this.ililIiliiIiilIilii = null;
      this.liilIiliiiiilIilii = -1;
      this.IIIiIiliilIIiIilii = 0;
   }

   private boolean IIllllIlll() {
      long var3 = -3367846388713437523L;
      var3 ^= (
            (long)(
                     !Iiiilllliiilll.field_1724.method_6047().method_7909().method_57347().method_57832(class_9334.field_50075)
                           && !Iiiilllliiilll.field_1724.method_6079().method_7909().method_57347().method_57832(class_9334.field_50075)
                        ? 0
                        : 1
                  )
                  << 32
               ^ var3
         )
         & -1L << 32;
      var3 ^= (
            (long)(
                  !(Iiiilllliiilll.field_1724.method_6047().method_7909() instanceof class_1819)
                        && !(Iiiilllliiilll.field_1724.method_6079().method_7909() instanceof class_1819)
                     ? 0
                     : 1
               )
               ^ var3
         )
         & -1L >>> 32;
      return ((int)(var3 >>> 32) != 0 || (int)var3 != 0) && this.iIlllIllll();
   }

   private void Iillllilll() {
      long var6 = 2773304980191578377L;
      long var8 = -2075488780393102615L;
      class_2338 var1 = this.lllllillll();
      if (var1 != null) {
         class_2680 var2 = Iiiilllliiilll.field_1687.method_8320(var1);
         Iiiilllliiilll.field_1690.field_1904.method_23481(false);
         if (this.lIilliIill(var1)) {
            this.iIiilIliil();
         } else {
            var6 ^= ((long)((Integer)var2.method_11654(class_4969.field_23153)).intValue() << 32 ^ var6) & -1L << 32;
            var6 ^= ((long)iliilliIiiilli.lIiiIiIlilli(var1) ^ var6) & -1L >>> 32;
            if (this.ililIiliiIiilIilii != null) {
               var8 ^= ((long)((int)var6 == 0 && (this.liilIiliiiiilIilii <= 0 || (int)(var6 >>> 32) != this.liilIiliiiiilIilii) ? 0 : 1) << 32 ^ var8)
                  & -1L << 32;
               if (this.ililIiliiIiilIilii.equals(var1)
                  && (int)(var8 >>> 32) != 0
                  && this.IIIiIiliilIIiIilii < ((-357645155 << 27 | -357645155 >>> 5) * 109 * 29 ^ 910148238)) {
                  this.IIIiIiliilIIiIilii++;
                  return;
               }

               this.iilllIIill(var1, (int)(var6 >>> 32), (boolean)((int)var6));
            }

            if ((int)var6 == 0) {
               if (!this.IlliIiliillliIilii.iIlIlllllill(var1)) {
                  if ((int)(var6 >>> 32) == 0) {
                     if (this.llIililIil(var1)) {
                        this.IIiillIiil(var1, (int)(var6 >>> 32));
                     }
                  } else {
                     if (this.Ilillllill(var1)) {
                        return;
                     }

                     if (this.IiIilliIil(var1)) {
                        this.IIiillIiil(var1, (int)(var6 >>> 32));
                        this.iiIiIiliiIIliIilii = true;
                        this.iiIilIIlil();
                     }
                  }
               }
            }
         }
      }
   }

   private void iilllIIill(class_2338 pending, int charge, boolean pos) {
      long var5 = 3244078513885863438L;
      if (this.ililIiliiIiilIilii.equals(pending) && this.liilIiliiiiilIilii == 0 && !pos) {
         if (charge > 0) {
            this.IlliIiliillliIilii.liiiIIllIl(pending);
         } else {
            var5 ^= ((long)this.IlliIiliillliIilii.IliIlllilIi(pending) << 32 ^ var5) & -1L << 32;
            if ((int)(var5 >>> 32) != 0) {
               this.iIIilIlIil(
                  IliIlllilIi<"IliIlllilIi","P6Z7khkZeMrfpU0odBpGBRN7FxVgwX56G6raS0dFkLuahD+7uR6ffPLZoYvf7nDgPz3MgnH5kfliFhuQGz7pQBPkQDPVsO+9pFA9hpfMJb+tVsx9+tLl1MUyjp6puwa/dxedvs7QIJWdhk4fpkMzVY6fFGD6/CuMq+HeMYnxL6Qv/1sR2053TKB3SZzN9A==">()
               );
            }
         }
      } else if (pos) {
      }

      this.iIiilIliil();
   }

   @Override
   public void Illillliilli() {
      this.lliililiil();
   }

   private class_2338 lllllillll() {
      if (!this.IliIlllilIi() || Iiiilllliiilll.field_1724 == null || Iiiilllliiilll.field_1687 == null || Iiiilllliiilll.field_1755 != null) {
         return null;
      } else if (this.iIlllIllll() && !this.IIllllIlll()) {
         if (Iiiilllliiilll.field_1765 instanceof class_3965 var1 && var1.method_17783() == class_240.field_1332) {
            return Iiiilllliiilll.field_1687.method_8320(var1.method_17777()).method_27852(class_2246.field_23152) ? var1.method_17777() : null;
         }

         return null;
      } else {
         return null;
      }
   }

   private boolean IIIillIIil(class_2338 anchor, String what) {
      class_3965 var3 = this.ilillIiill(anchor);
      if (var3 == null) {
         return false;
      } else {
         Iiiilllliiilll.field_1761.method_2896(Iiiilllliiilll.field_1724, class_1268.field_5808, var3);
         this.lIliIiliiiIliIilii = Iiiilllliiilll.field_1724.field_6012;
         iiilIiIIIiIi.liiiIIllIl(IIllIIlilIllIIli.IlIlllIlilIl());
         return true;
      }
   }

   private void lliililiil() {
      this.iillIiliiIIilIilii = 0;
      this.lIilIiliiiIilIilii = 0;
      this.IlilIiliillilIilii = 0;
      this.iiIiIiliiIIliIilii = false;
      this.lIliIiliiiIliIilii = (879236028 + -123) * -1944890851 ^ 13 ^ -1077411760;
      this.IlliIiliillliIilii.lIiiIiIlilli();
      this.iIiilIliil();
      this.illilIilil();
   }

   private boolean iIlllIllll() {
      return GLFW.glfwGetMouseButton(Iiiilllliiilll.method_22683().method_4490(), 1) == ((-717854524 - -69 << 17 | -717854524 - -69 >>> 15) ^ -770463123);
   }

   private boolean Ilillllill(class_2338 pos) {
      if (llilIllililIll.iliIiiliiiii(IIiiIillIiiIil.class) instanceof IIiiIillIiiIil var3 && var3.IliIlllilIi() && var3.IIllllIlll(pos)) {
         return true;
      }

      return false;
   }

   private void Illillllil() {
      if (this.IIllIiliilIllIilii.Iilllilliill() && Iiiilllliiilll.field_1724 != null) {
         ilIiiIiIii.IliIlllilIi(
            this,
            Iiiilllliiilll.field_1724.method_36454(),
            (float)this.iIllIiliiIlllIilii.Iilllilliill(),
            (561734924 * 1332920885 * 1084587701 >>> 19 | 561734924 * 1332920885 * 1084587701 << 13) ^ 265655043,
            true
         );
      }
   }

   private void lililiilil() {
      if (this.iiIiIiliiIIliIilii && Iiiilllliiilll.field_1724 != null) {
         if (this.iIIiIiliiIlIiIilii == 0) {
            if (Iiiilllliiilll.field_1755 == null) {
               this.iiIiIiliiIIliIilii = false;
               if (this.ilIlIiliiIiIlIilii.Iilllilliill()) {
                  int var1 = IilIIililIIi.lIiiIiIlilli(class_1802.field_23141);
                  if (var1 != -1) {
                     Iiiilllliiilll.field_1724.method_31548().method_61496(var1);
                  }
               }
            }
         }
      }
   }

   private void lIliliIlil() {
      if (this.iIIiIiliiIlIiIilii != 0) {
         if (Iiiilllliiilll.field_1755 == null) {
            int var1 = IilIIililIIi.lIiiIiIlilli(class_1802.field_8634);
            if (var1 == -1) {
               this.illilIilil();
            } else {
               Iiiilllliiilll.field_1690.field_1904.method_23481(false);
               switch (this.iIIiIiliiIlIiIilii) {
                  case 1:
                     Iiiilllliiilll.field_1724.method_31548().method_61496(var1);
                     this.Illillllil();
                     this.iIIiIiliiIlIiIilii = 2;
                     break;
                  case 2:
                     this.Illillllil();
                     float var2 = Iiiilllliiilll.field_1724.method_36455();
                     if (this.IIllIiliilIllIilii.Iilllilliill()) {
                        Iiiilllliiilll.field_1724.method_36457((float)this.iIllIiliiIlllIilii.Iilllilliill());
                     }

                     Iiiilllliiilll.field_1761.method_2919(Iiiilllliiilll.field_1724, class_1268.field_5808);
                     Iiiilllliiilll.field_1724.method_36457(var2);
                     this.IiIiIiliiliIiIilii = System.currentTimeMillis();
                     this.iIIiIiliiIlIiIilii = 3;
                     break;
                  default:
                     if (this.llIiIiliiilIiIilii >= 0 && this.llIiIiliiilIiIilii <= 8) {
                        Iiiilllliiilll.field_1724.method_31548().method_61496(this.llIiIiliiilIiIilii);
                     }

                     this.illilIilil();
               }
            }
         }
      }
   }

   public void iiIilIIlil() {
      if (this.liIlIiliiiiIlIilii.Iilllilliill() && this.iIIiIiliiIlIiIilii == 0 && Iiiilllliiilll.field_1724 != null) {
         if (System.currentTimeMillis() - this.IiIiIiliiliIiIilii
            >= (long)this.llllIiliiilllIilii.Iilllilliill() * (8326654153185650933L ^ 8326654153185651485L)) {
            if (IilIIililIIi.lIiiIiIlilli(class_1802.field_8634) != (~(-1903513290 + 103) * -1057222719 + 57 ^ -293590556)) {
               this.llIiIiliiilIiIilii = Iiiilllliiilll.field_1724.method_31548().method_67532();
               this.iIIiIiliiIlIiIilii = 1;
            }
         }
      }
   }

   @Override
   public boolean IlIllllIll() {
      return this.lllllillll() != null || Iiiilllliiilll.field_1724 != null && Iiiilllliiilll.field_1724.field_6012 == this.lIliIiliiiIliIilii;
   }

   private boolean llIililIil(class_2338 pos) {
      long var3 = -3938792084808366953L;
      if (!Iiiilllliiilll.field_1724.method_6047().method_31574(class_1802.field_8801)) {
         if (this.iillIiliiIIilIilii < this.IiiIIiliiliiIIilii.Iilllilliill()) {
            this.iillIiliiIIilIilii++;
            return false;
         }

         this.iillIiliiIIilIilii = 0;
         var3 ^= ((long)IilIIililIIi.lIiiIiIlilli(class_1802.field_8801) << 32 ^ var3) & -1L << 32;
         if ((int)(var3 >>> 32) == (~(~(~879224939)) * -41 ^ -1688484173)) {
            return false;
         }

         Iiiilllliiilll.field_1724.method_31548().method_61496((int)(var3 >>> 32));
      }

      if (this.lIilIiliiiIilIilii < this.iiiIIiliiIIIlIilii.Iilllilliill()) {
         this.lIilIiliiiIilIilii++;
         return false;
      } else if (Iiiilllliiilll.field_1724.method_6047().method_31574(class_1802.field_8801)
         && this.liilliiill(pos)
         && this.IIIillIIil(pos, IliIlllilIi<"IliIlllilIi","MxZcp4cV7Mzf5Jpy1ADhdBFSuQZ0ZrHivWwW51UGPbYLcw==">())) {
         this.lIilIiliiiIilIilii = 0;
         return true;
      } else {
         return false;
      }
   }

   private boolean liilliiill(class_2338 anchor) {
      return !iiilIiIIIiIi.IliIlllilIi(IIllIIlilIllIIli.IlIlllIlilIl())
         ? false
         : !Iiiilllliiilll.field_1724.method_21823()
            || Iiiilllliiilll.field_1724.method_6047().method_7960() && Iiiilllliiilll.field_1724.method_6079().method_7960();
   }

   private boolean lIilliIill(class_2338 pos) {
      if (llilIllililIll.iliIiiliiiii(IIiiIillIiiIil.class) instanceof IIiiIillIiiIil var2 && var2.liIlliiIll(pos)) {
         return true;
      }

      return false;
   }

   private class_3965 ilillIiill(class_2338 anchor) {
      class_243 var2 = Iiiilllliiilll.field_1724.method_33571();
      double var3 = Math.min(Double.longBitsToDouble(4923464849450048572L ^ 306712281441868860L), Iiiilllliiilll.field_1724.method_55754());
      class_243 var5 = var2.method_1019(ilIiiIiIii.Iiilliiliiil(ilIiiIiIii.Iilllilliill(), ilIiiIiIii.IIillIiliIil()).method_1021(var3));
      class_3965 var6 = Iiiilllliiilll.field_1687
         .method_17742(new class_3959(var2, var5, class_3960.field_17559, class_242.field_1348, Iiiilllliiilll.field_1724));
      if (var6 != null && var6.method_17783() == class_240.field_1332 && var6.method_17777().equals(anchor)) {
         return var2.method_1025(var6.method_17784()) <= var3 * var3 ? var6 : null;
      } else {
         return null;
      }
   }

   public boolean liIlliiIll() {
      return this.IliIlllilIi() && Iiiilllliiilll.field_1724 != null && this.iIlllIllll() && !this.IIllllIlll();
   }
}

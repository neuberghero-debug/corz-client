package gg.corz;

import net.minecraft.class_1268;
import net.minecraft.class_1661;
import net.minecraft.class_1799;
import net.minecraft.class_1802;

public class lliIlIiiliIlIi extends ilIllIiIll {
   public final iilliIlIIiliIl IiiiIlIiiliiiIlIii = new iilliIlIIiliIl(
      IliIlllilIi<"IliIlllilIi","iJu11nRH8jabQJdnCabAo3Ne3esXa5tvwohfEJ8e6yi4WSpMc5igzgeGpnw=">(),
      IliIlllilIi<"IliIlllilIi","CnFuQT1H3cMOXeItxMpcycO+PXRbgKWWY0RJe9FjHUvKVQrN0fxcqEawpAd5HiV1oKX0UcXg4sJeDM+TMdoyKg==">(),
      1,
      1,
      (~1605854297 * -1108378657 >>> 5 | ~1605854297 * -1108378657 << 27) * -29 ^ 419291325
   );
   private int iiiiIlIiiIIIIllIii;
   private int lIIIllIiiiIIIllIii;
   private static final int lliiIlIiiiliiIlIii = 10;

   private int iiiIlIIIll() {
      for (int var1 = 0; var1 < 9; var1++) {
         if (Iiiilllliiilll.field_1724.method_31548().method_5438(var1).method_31574(class_1802.field_8634)) {
            return var1;
         }
      }

      return -1;
   }

   @Override
   protected void Illillliilli() {
      this.iiiiIlIiiIIIIllIii = 0;
      this.lIIIllIiiiIIIllIii = 0;
   }

   public lliIlIiiliIlIi() {
      super(IliIlllilIi<"IliIlllilIi","pu89KNFeeIoBZWFDNmhV0/anbTIowZIp/ISY2UY8nRWCmqfDyA==">(), lllIllillIll.liiIIIIiiiiIIIIi);
      this.IlIlllIlilIl(new IilliIllilliIl[]{this.IiiiIlIiiliiiIlIii});
   }

   @Override
   protected void iIIIlIlIIl() {
      if (Iiiilllliiilll.field_1724 == null || Iiiilllliiilll.field_1761 == null) {
         this.Ililllililil();
      } else if (Iiiilllliiilll.field_1755 == null) {
         class_1661 var1 = Iiiilllliiilll.field_1724.method_31548();
         switch (this.iiiiIlIiiIIIIllIii) {
            case 0:
               int var4 = this.iiiIlIIIll();
               if (var4 == -1) {
                  this.Ililllililil();
                  return;
               }

               if (var1.method_67532() != var4) {
                  var1.method_61496(var4);
               }

               this.iiiiIlIiiIIIIllIii = 1;
               break;
            case 1:
               class_1799 var3 = Iiiilllliiilll.field_1724.method_6047();
               if (!var3.method_31574(class_1802.field_8634)) {
                  this.iiiiIlIiiIIIIllIii = 2;
                  return;
               }

               if (Iiiilllliiilll.field_1724.method_7357().method_7904(var3)) {
                  if (++this.lIIIllIiiiIIIllIii > 10) {
                     this.iiiiIlIiiIIIIllIii = 2;
                  }

                  return;
               }

               Iiiilllliiilll.field_1761.method_2919(Iiiilllliiilll.field_1724, class_1268.field_5808);
               this.iiiiIlIiiIIIIllIii = 2;
               break;
            default:
               int var2 = this.IiiiIlIiiliiiIlIii.Iilllilliill() - 1;
               if (var1.method_67532() != var2) {
                  var1.method_61496(var2);
               }

               this.Ililllililil();
         }
      }
   }
}

package gg.corz;

import net.minecraft.class_10255;
import net.minecraft.class_1313;
import net.minecraft.class_746;

public class iilliIIlIIiliIIl extends ilIllIiIll {
   private class_10255 IliIiIilIl;
   private final iiIiiilIIliiil iIiIiIilIl;
   private final IIIIlilllIIIlill lIiIiIilIl;
   private final IIIIlilllIIIlill IIiIiIilIl = new IIIIlilllIIIlill(
      IliIlllilIi<"IliIlllilIi","aAiuaFAkvkPIRVFVU5pd3iHBSiJwdyBRFlo+2XU+KpXM+UciE1hHyCEqXNQ=">(),
      IliIlllilIi<"IliIlllilIi","HhTSiabenv4xs/Ev0CZcaCA+pA5ykp9waX7vWduQW/Kv+YoSWX4baiKFRLOZk6KWAtLLsUko9BiNUl8QLnWkKTcys3HG+MCzofw7MUjVcDoiAlmokZ3NwR/mQC/ou6YWWsDU">(),
      0.6,
      0.1,
      5.0,
      0.05
   );

   private void lIIlliIIll() {
      if (this.IliIiIilIl != null) {
         this.IliIiIilIl.field_5960 = false;
         this.IliIiIilIl = null;
      }
   }

   public iilliIIlIIiliIIl() {
      super(IliIlllilIi<"IliIlllilIi","gzr2/vRptKse7R4zkfCbNreEMULlDvEAMyxMK4/Tb3whHgU=">(), lllIllillIll.IiIlIIIiliIlIIIi);
      this.lIiIiIilIl = new IIIIlilllIIIlill(
         IliIlllilIi<"IliIlllilIi","4ytqU7U5BHbutXTOROAZD7xxsAWltQvpYQzm3LV1yejH9Ho1AzYNxRkL">(),
         IliIlllilIi<"IliIlllilIi","M2cpLiIiAJfPuChdx8r0+13auDdJK7qSTPPWBmgCnmQ9Se1GE3m5EkxQGc2g36PK2cqUpdaUcwQRT5mBEREKSTAWNDT64kLxejMeWFnBTCE=">(),
         0.5,
         0.1,
         5.0,
         0.05
      );
      this.iIiIiIilIl = new iiIiiilIIliiil(
         IliIlllilIi<"IliIlllilIi","jLqCHuCLQHIvyO1AOXyZ2yxsQMFY3h5bTALOy+zzTC9Z9w==">(),
         IliIlllilIi<"IliIlllilIi","CwW4uwhIGZcfsTtYLtI+qosy0xHpqnDLwKQk7uLWuL+LAcRVF+MVEtBclXPDhRgCpYBm91gtzFhO22U6cTt1IPIwlLg3pBtKzH3WkJkesJ7pytCVjfA/D63qP3HApIzGPPQOreByYq9gFGTvrwn1/xB9hJexr9d3Qi4zXK3O8c5cQglvo8EtjjhLj87Zt2qz3a69vQqWwIRInga0CZlsXm2vGQZYt6Xji7KsLA==">(),
         true
      );
      this.IlIlllIlilIl(new IilliIllilliIl[]{this.IIiIiIilIl, this.lIiIiIilIl, this.iIiIiIilIl});
   }

   @Override
   protected void iIIIlIlIIl() {
      if (this.IliIiIilIl != null && (Iiiilllliiilll.field_1724 == null || Iiiilllliiilll.field_1724.method_5854() != this.IliIiIilIl)) {
         this.lIIlliIIll();
      }
   }

   public boolean iiiIlIIIll(class_10255 type, class_1313 boat) {
      long var11 = -1520071789637614339L;
      class_746 var3 = Iiiilllliiilll.field_1724;
      if (var3 != null && var3.method_5854() == type) {
         double var4 = (Iiiilllliiilll.field_1690.field_1894.method_1434() ? 1.0 : 0.0) - (Iiiilllliiilll.field_1690.field_1881.method_1434() ? 1.0 : 0.0);
         double[] var6 = IilIililIi.IliIlllilIi(0.0, var4, this.IIiIiIilIl.Iilllilliill(), type.method_36454());
         double var7 = 0.0;
         var11 ^= ((long)Iiiilllliiilll.field_1690.field_1903.method_1434() << 32 ^ var11) & -1L << 32;
         var11 ^= ((long)Iiiilllliiilll.field_1690.field_1832.method_1434() ^ var11) & -1L >>> 32;
         if ((int)(var11 >>> 32) != (int)var11) {
            var7 = (int)(var11 >>> 32) != 0 ? this.lIiIiIilIl.Iilllilliill() : -this.lIiIiIilIl.Iilllilliill();
         }

         type.method_18800(var6[0], var7, var6[1]);
         type.field_5960 = this.iIiIiIilIl.Iilllilliill();
         this.IliIiIilIl = type;
         type.field_6017 = 0.0;
         var3.field_6017 = 0.0;
         type.method_5784(boat, type.method_18798());
         return true;
      } else {
         return false;
      }
   }

   @Override
   protected void Iilililiiili() {
      this.lIIlliIIll();
   }
}

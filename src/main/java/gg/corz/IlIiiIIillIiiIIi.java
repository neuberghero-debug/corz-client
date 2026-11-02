package gg.corz;

import com.google.gson.JsonObject;
import net.minecraft.class_2338;
import net.minecraft.class_243;

public final class IlIiiIIillIiiIIi {
   public transient long iiIiIiiiil;
   public int iIIiIiiiil;
   public transient long liIiIiiiil;
   public int IlIiIiiiil;
   public String llIiIiiiil = Illlllllilll<"Illlllllilll","U2YU9ACjjQwL0b+M3jyJBGN/9zvJWHtCSZC0bvz87Zd8UB0tjEjqzGRIyr8/bho=">();
   public int lIIiIiiiil;
   public transient boolean IiIiIiiiil;
   public IlliliIillliliIi ilIiIiiiil = IlliliIillliliIi.illlIiiIIi;

   public boolean IIIllIIliIIl() {
      return this.ilIiIiiiil == IlliliIillliliIi.llllIiiIIi || this.ilIiIiiiil == IlliliIillliliIi.illlIiiIIi;
   }

   public IlIiiIIillIiiIIi() {
      this.liIiIiiiil = -4611686018427387904L;
      this.iiIiIiiiil = -4611686018427387904L;
   }

   public String IlIlllIlilIl() {
      return this.ilIiIiiiil
         + Illlllllilll<"Illlllllilll","uE69tBLfejpQ222s7YSOu0Lup8XKPlJDps2WT6Ddjg==">()
         + this.lIIiIiiiil
         + Illlllllilll<"Illlllllilll","TIRfqVO4uNHBI+CW7HrK8omBXGv5qnJx8gpGQaA=">()
         + this.iIIiIiiiil
         + Illlllllilll<"Illlllllilll","TIRfqVO4uNHBI+CW7HrK8omBXGv5qnJx8gpGQaA=">()
         + this.IlIiIiiiil;
   }

   public void IliIlllilIi(boolean tick, long full) {
      this.IiIiIiiiil = tick;
      if (tick) {
         this.liIiIiiiil = full;
      }
   }

   public static IlIiiIIillIiiIIi IIlllIlliIll(JsonObject o) {
      IlIiiIIillIiiIIi var1 = new IlIiiIIillIiiIIi();

      try {
         var1.lIIiIiiiil = o.get(Illlllllilll<"Illlllllilll","zkv0CWc5MmFYR6ldKAUGoa2ZME1wU8z6vfS0hM4=">()).getAsInt();
         var1.iIIiIiiiil = o.get(Illlllllilll<"Illlllllilll","5RENgE4CNUPEFE2213EDmS3551TGRu5/DczTZG4=">()).getAsInt();
         var1.IlIiIiiiil = o.get(Illlllllilll<"Illlllllilll","AQhrxVjof7kPLEE/25/YY7apBBWgTY5O6riijPw=">()).getAsInt();
         if (o.has(Illlllllilll<"Illlllllilll","4mY970tVuc0VPsL20S2KjEuGeN3p6IaJiaHZwSZJ0PVkPKRL0A==">())) {
            var1.llIiIiiiil = o.get(Illlllllilll<"Illlllllilll","4mY970tVuc0VPsL20S2KjEuGeN3p6IaJiaHZwSZJ0PVkPKRL0A==">()).getAsString();
         }

         if (o.has(Illlllllilll<"Illlllllilll","gdrbvGiRBsV7rAwAdv4gFlSZiSPy6BoRdkiGAVzsqsQ=">())) {
            var1.ilIiIiiiil = IlliliIillliliIi.valueOf(o.get(Illlllllilll<"Illlllllilll","gdrbvGiRBsV7rAwAdv4gFlSZiSPy6BoRdkiGAVzsqsQ=">()).getAsString());
         }
      } catch (Exception var3) {
      }

      return var1;
   }

   public JsonObject IiIlliIliiIl() {
      JsonObject var1 = new JsonObject();
      var1.addProperty(Illlllllilll<"Illlllllilll","zkv0CWc5MmFYR6ldKAUGoa2ZME1wU8z6vfS0hM4=">(), this.lIIiIiiiil);
      var1.addProperty(Illlllllilll<"Illlllllilll","5RENgE4CNUPEFE2213EDmS3551TGRu5/DczTZG4=">(), this.iIIiIiiiil);
      var1.addProperty(Illlllllilll<"Illlllllilll","AQhrxVjof7kPLEE/25/YY7apBBWgTY5O6riijPw=">(), this.IlIiIiiiil);
      var1.addProperty(Illlllllilll<"Illlllllilll","4mY970tVuc0VPsL20S2KjEuGeN3p6IaJiaHZwSZJ0PVkPKRL0A==">(), this.llIiIiiiil);
      var1.addProperty(Illlllllilll<"Illlllllilll","gdrbvGiRBsV7rAwAdv4gFlSZiSPy6BoRdkiGAVzsqsQ=">(), this.ilIiIiiiil.name());
      return var1;
   }

   public boolean iliIiiliiiii() {
      return this.ilIiIiiiil == IlliliIillliliIi.iIllIiiIIi || this.ilIiIiiiil == IlliliIillliliIi.illlIiiIIi;
   }

   public class_243 iIlIlllllill() {
      return new class_243((double)this.lIIiIiiiil + 0.5, (double)this.iIIiIiiiil + 0.5, (double)this.IlIiIiiiil + 0.5);
   }

   public boolean lIiiIiIlilli() {
      return this.ilIiIiiiil == IlliliIillliliIi.IlllIiiIIi || this.ilIiIiiiil == IlliliIillliliIi.illlIiiIIi;
   }

   public class_2338 liiiIIllIl() {
      return new class_2338(this.lIIiIiiiil, this.iIIiIiiiil, this.IlIiIiiiil);
   }

   public IlIiiIIillIiiIIi(class_2338 pos, String dimension, IlliliIillliliIi role) {
      this.liIiIiiiil = -4611686018427387904L;
      this.iiIiIiiiil = -4611686018427387904L;
      this.lIIiIiiiil = pos.method_10263();
      this.iIIiIiiiil = pos.method_10264();
      this.IlIiIiiiil = pos.method_10260();
      this.llIiIiiiil = dimension;
      this.ilIiIiiiil = role;
   }

   public boolean IilliliilIIi(String dim) {
      return this.llIiIiiiil != null && this.llIiIiiiil.equals(dim);
   }
}

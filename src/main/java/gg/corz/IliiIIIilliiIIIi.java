package gg.corz;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

public class IliiIIIilliiIIIi extends ilIllIiIll {
   private static final String IIilIlliil = "sidebarCollapsed";
   private static IliiIIIilliiIIIi lIilIlliil;
   private final iiIiiilIIliiil iIilIlliil = new iiIiiilIIliiil(
      IliIlllilIi<"IliIlllilIi","rHYg4qB8uA7Cud6o7KFiJv1NOSn/3EuwKjK1SjXdffSX9A==">(),
      IliIlllilIi<"IliIlllilIi","ARKDKonmLRJf4wApQBP7uTFqvDpGpik6YTD71YdyrLdmOjkG+l7pbBoEKoyCQv42gENXxE0B7BEaPzXeoSCu5ge1JCg5HCmZHdg=">(),
      false
   );
   public static final int iillIlliil = 344;

   public static boolean iiiIlIIIll() {
      return lIilIlliil != null && lIilIlliil.iIilIlliil.Iilllilliill();
   }

   @Override
   public void Iilililiiili() {
      this.Ililllililil();
   }

   @Override
   public void iIiIlIliIl(JsonElement element) {
      if (element != null && element.isJsonObject()) {
         JsonElement var2 = element.getAsJsonObject().get(IliIlllilIi<"IliIlllilIi","3psBNjIMarpcLxxBnxBqOPzLdZS8Yzw3v0Gp9yE0v8yPh4QkvFKkokSjv2I=">());
         if (var2 != null && var2.isJsonPrimitive() && var2.getAsJsonPrimitive().isBoolean()) {
            IIIiliIilIIiliIi.IliIlllilIi().Iilllilliill(var2.getAsBoolean());
         }
      }
   }

   public IliiIIIilliiIIIi() {
      super(IliIlllilIi<"IliIlllilIi","GoecCW1+wWFmCIeWjU4wSwJCRgT9jHgKP3NQX7qAKe38DsDuWxjerQ==">(), lllIllillIll.IlllIIIillllIIIi);
      this.IlIlllIlilIl(new IilliIllilliIl[]{this.iIilIlliil});
      this.IlIillIiilIi(-(~-781561189) + -33 ^ -781561053);
      this.IIillIiliIil(true);
      lIilIlliil = this;
   }

   @Override
   public void IlIillIiilIi(int bindKey) {
      super.IlIillIiilIi(
         bindKey < 0 ? ((407520062 >>> 3 | 407520062 << 29) >>> 9 | (407520062 >>> 3 | 407520062 << 29) << 23) ^ -119 ^ -93 ^ 870417878 : bindKey
      );
   }

   @Override
   public boolean Iilllilliill() {
      return true;
   }

   @Override
   public JsonElement IIiIllIiIl() {
      JsonObject var1 = new JsonObject();
      var1.addProperty(
         IliIlllilIi<"IliIlllilIi","3psBNjIMarpcLxxBnxBqOPzLdZS8Yzw3v0Gp9yE0v8yPh4QkvFKkokSjv2I=">(), IIIiliIilIIiliIi.IliIlllilIi().Illlllllilll()
      );
      return var1;
   }
}

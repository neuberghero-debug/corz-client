package gg.corz;

import java.util.List;
import net.minecraft.class_2338;

record iIlillllIllillll(IiIIiIilliIIiIil kind, List<class_2338> cells) {
   private final List<class_2338> iIIlliIill;
   private final IiIIiIilliIIiIil lIIlliIill;

   public List<class_2338> liiiIIllIl() {
      return this.iIIlliIill;
   }

   private iIlillllIllillll(IiIIiIilliIIiIil kind, List<class_2338> cells) {
      this.lIIlliIill = kind;
      this.iIIlliIill = cells;
   }

   public IiIIiIilliIIiIil IliIlllilIi() {
      return this.lIIlliIill;
   }
}
